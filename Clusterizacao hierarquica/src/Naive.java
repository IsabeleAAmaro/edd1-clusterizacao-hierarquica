import java.util.ArrayList;
import java.util.List;

public class Naive {

    public int n; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
    public Ponto[] pontos;
    public List<Cluster> listaClusters;
    public List<Cluster> clusterDesativados = new ArrayList<>();

    public Naive(int n) {
        this.n = n;
        this.pontos = new Ponto[n];
        listaClusters = criaClustersIndv(this.pontos, this.n);
    }

    public List<Cluster> criaClustersIndv(Ponto[] pontos, int limite) {
        List<Cluster> clustersIndv = new ArrayList<>();

        for (int i = 0; i < limite; i++) {
            pontos[i] = new Ponto(100);
        }

        for (Ponto ponto : pontos) {
            clustersIndv.add(new Cluster(ponto));
        }

        return clustersIndv;
    }

    public Distancia calculaDistancia() { //O(n²)???? n sei
        Distancia distancia_aux = new Distancia(Double.MAX_VALUE);

        for (int i = 0; i < listaClusters.size() - 1; i++) {
            for (int j = i + 1; j < listaClusters.size(); j++) {
                Distancia distancia = new Distancia(listaClusters.get(i), listaClusters.get(j));

                if (distancia.distancia < distancia_aux.distancia) {
                    distancia_aux = distancia;
                }
            }
        }
        return distancia_aux;
    }

    public void removeClusters(Cluster c1, Cluster c2) {
        clusterDesativados.add(c1);
        clusterDesativados.add(c2);
        listaClusters.removeAll(clusterDesativados); //O(1)

    }

    public void clusteriza() {
        while(listaClusters.size() > 1) {
            Distancia menordistancia = calculaDistancia();
            Cluster cluster = new Cluster(menordistancia.getC1(), menordistancia.getC2());
            removeClusters(menordistancia.getC1(), menordistancia.getC2());
            listaClusters.add(cluster);
        }
    }

    public void getRaizDosClusters() {
        System.out.println("Nos do cluster: " + getListaClusters().get(0).getRaiz().contaNos());
    }

    public List<Cluster> getListaClusters() {
        return listaClusters;
    }

    public List<Cluster> getClusterDesativados() {
        return clusterDesativados;
    }
}