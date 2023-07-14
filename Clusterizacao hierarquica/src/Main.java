import java.util.List;
import java.util.ArrayList;

public class Main {

    //Mudanças com a criação das listas:
    /*
    /1 - lista de clusters é criada chamando o metodo estatico
    /2 - o metodo estatico é da classe clusters? se ele retorna uma lista de instancias de cluster
     */

    public static void main(String[] args) {
        int n = 10; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
        Ponto[] pontos = new Ponto[n];
        Cluster[] clusters = new Cluster[n];
        Distancia[] distancias = new Distancia[n * 2 - 1];

        for (int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
        }

        List<Cluster> clusterList = Cluster.criarClustersIndv(pontos);

        while(clusterList.size() > 1) {
            Cluster c1, c2 = null;
            double menor_distancia = Double.MAX_VALUE;

            for(int i = 0; i < clusterList.size(); i++) {
                for(int j = i + 1; j < clusterList.size(); j++) {
                    Distancia distancia = new Distancia(clusterList.get(i), clusterList.get(j));
                    if(distancia.getDistancia() < menor_distancia) {
                        menor_distancia = distancia.getDistancia();
                        c1 = clusterList.get(i);
                        c2 = clusterList.get(j);
                    }
                }
            }

            /*
            public void calculaCentroide(){

            double sumX = 0;
            double sumY = 0;

            for (Ponto ponto : pontos) {
                sumX += ponto.getX();
                sumY += ponto.getY();
            }

            double mediaX = sumX / size;
            double mediaY = sumY / size;

            this.centroide = new Ponto(mediaX, mediaY);
            }
             */

            //Pra dar merge, calcular novo centroide
        }
        }

        public static Cluster clusterizacao(Cluster c1, Cluster c2) {
        //Só pra não dar erro de empty body

        Cluster novoCluster = new Cluster(c1, c2);

        return novoCluster;

        }
    }


