import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private Ponto[] pontos;
    private Ponto centroide;
    private int size;

    public Cluster(Ponto p){
        this.pontos = new Ponto[1];
        this.pontos[0] = p;
        this.centroide = p;
        this.size = 1;
    }

    public Cluster(Cluster c1, Cluster c2){

        this.size = c1.size + c2.size;
        this.pontos = new Ponto[size];

        for (int i = 0; i < c1.size; i++)
            this.pontos[i] =  c1.pontos[i];

        for (int i = c1.size, j = 0; j < c2.size; i++, j++)
            this.pontos[i] = c2.pontos[j];

        calculaCentroide();
    }

    public int getSize(){
        return size;
    }

    public Ponto getCentroide(){
        return centroide;
    }

    public String imprimeCentroide(){
        return centroide.toString();
    }

    public void calculaCentroide(){

        double sumX = 0;
        double sumY = 0;

        for (Ponto ponto : pontos) {
            sumX += ponto.x;
            sumY += ponto.y;
        }

        double mediaX = sumX / size;
        double mediaY = sumY / size;

        this.centroide = new Ponto(mediaX, mediaY);
    }

    //A gambiarra kkkkkk tá private-package mas acho q vou botar público depois
    //Pesquisar oq é melhor: private-package ou public
    static List<Cluster> criarClustersIndv(Ponto[] pontos) {
        List<Cluster> clustersIndv = new ArrayList<>();

        for (Ponto ponto : pontos) {
            clustersIndv.add(new Cluster(ponto));
        }

        return clustersIndv;
    }


}