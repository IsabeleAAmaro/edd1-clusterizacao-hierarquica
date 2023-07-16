import java.util.ArrayList;
import java.util.List;

public class Cluster implements Comparable<Cluster> {
    private Ponto[] pontos;
    private Ponto centroide;
    private int size;
    private Arvbin<Cluster> raiz;

    public Cluster(Ponto p){
        this.pontos = new Ponto[1];
        this.pontos[0] = p;
        this.centroide = p;
        this.size = 1;
        this.raiz = new Arvbin<>(this);
    }

    public Cluster(Cluster c1, Cluster c2){

        this.size = c1.size + c2.size;
        this.pontos = new Ponto[size];

        for (int i = 0; i < c1.size; i++)
            this.pontos[i] =  c1.pontos[i];

        for (int i = c1.size, j = 0; j < c2.size; i++, j++)
            this.pontos[i] = c2.pontos[j];

        this.raiz = new Arvbin<>(this, c1.getRaiz(), c2.getRaiz());
        //Será que esse calcula centroide tá certo?
        calculaCentroide();
    }

    public int getSize(){
        return size;
    }

    public Arvbin<Cluster> getRaiz() {
        return raiz;
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

    public Ponto[] getPontos() {
        return pontos;
    }

    //A gambiarra kkkkkk tá private-package mas acho q vou botar público depois
    //Pesquisar oq é melhor: private-package ou public

    //???
    @Override
    public int compareTo(Cluster o) {
        return 0;
    }

    @Override
    public String toString() {
        return "X: " + this.centroide.x + " Y: " + this.centroide.y;
    }
}