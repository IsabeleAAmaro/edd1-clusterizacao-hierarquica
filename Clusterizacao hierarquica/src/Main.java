import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int n = 10; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
        Ponto[] pontos = new Ponto[n];
        List<Cluster> clusterList = Cluster.criarClustersIndv(pontos, n);
        List<Cluster> clusterDesativados = new ArrayList<>();

        //Calcular distancias
        List<Distancia> distancias = new ArrayList<>();
        for(int i = 0; i < clusterList.size(); i++) {
            for(int j = i + 1; j < clusterList.size(); j++) {
                Distancia distancia = new Distancia(clusterList.get(i), clusterList.get(j));
                distancias.add(distancia);
            }
        }
        //pega a menor distancia
        Distancia menord = distancias.get(0);
        for (Distancia d : distancias)
            if (d.distancia > menord.distancia)
                menord = d;

        //coloca num cluster, e remove os antigos
        while(clusterList.size() > 1) {
            Cluster cluster = new Cluster(menord.getC1(), menord.getC2());

            clusterDesativados.add(menord.getC1());
            clusterDesativados.add(menord.getC2());
            clusterList.removeAll(clusterDesativados);
            clusterList.add(cluster);

            //Pra testar:
            System.out.println("Centroide desse novo cluster: " + cluster.getCentroide());
            System.out.println("Centroide dos c1:" + clusterDesativados.get(0));
            System.out.println("Centroide dos c2: " + clusterDesativados.get(1));
        }
    }
}


