import java.util.ArrayList;
import java.util.List;

public class Naive {

    public int n; /* Tamanho do vetor de pontos e lista de clusters */
    public Ponto[] pontos; /* Vetor que contém todos os pontos do plano cartesiano */
    public List<Cluster> listaClusters; /* Lista de clusters */
    public List<Cluster> clusterDesativados = new ArrayList<>(); /* Lista de clusters que foram removidos da lista original */

    public Naive(int n) {
        this.n = n;
        this.pontos = new Ponto[n];
        listaClusters = criaClustersIndv(this.pontos, this.n); /* Chamando o método que gera os primeiros clusters */
    }

    //Complexidade: O(n²)
    public List<Cluster> criaClustersIndv(Ponto[] pontos, int limite) {
        List<Cluster> clustersIndv = new ArrayList<>();

        /* Gera n pontos com o construtor que gera pontos com coordenadas aleatórias, limite é igual a n e é também o bound do random*/
        for (int i = 0; i < limite; i++) {
            pontos[i] = new Ponto(limite);
        }

        /* Constroi clusters individuais (que depois serão clusterizados entre si) com os pontos gerados */
        for (Ponto ponto : pontos) {
            clustersIndv.add(new Cluster(ponto));
        }

        /* Retorna a lista que será atribuida á lista de clusters */
        return clustersIndv;
    }

    //Complexidade O(n²)
    /* Calcula as distancias entre clusters da lista e as compara para obter a menor distancia */
    public Distancia calculaDistancia() {
        /* Cria uma distancia cujo o valor é ______ */
        Distancia distancia_aux = new Distancia(Double.MAX_VALUE);

        /* Pega dois clusters, calcula a distancia entre eles, e compara com a distancia auxiliar até encontrar a menor */
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

    //Complexidade O(n + m)
    /* Remove da lista de clusters, os clusters que deixarão de existir porque serão fundidos, se tornando um novo cluster */
    public void removeClusters(Cluster c1, Cluster c2) {
        clusterDesativados.add(c1);
        clusterDesativados.add(c2);
        listaClusters.removeAll(clusterDesativados);

    }

    //Complexidade: O(n³)
    public void clusteriza() {
        /* Enquanto existir mais de um cluster, continue a clusterizar */
        while(listaClusters.size() > 1) {
            /* Obtem os dois clusters que possuem a menor distancia, ou seja, que serão ideais para agregação*/
            Distancia menordistancia = calculaDistancia();
            /* Inicializa novo cluster */
            Cluster cluster = new Cluster(menordistancia.getC1(), menordistancia.getC2());
            /* Remove os antigos clusters da lista de clusters */
            removeClusters(menordistancia.getC1(), menordistancia.getC2());
            /* Adiciona o novo cluster a lista de clusters */
            listaClusters.add(cluster);
        }
    }
}