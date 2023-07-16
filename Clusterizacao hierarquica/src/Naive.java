import java.util.ArrayList;
import java.util.List;

public class Naive {

    /*
    //1 - faz pontos com aleatorio OK
    //2 - inicializa como cluster OK
    //3 - calcula distancias
        - 1° Pega i (0) e j(1)
        - 2° Calcula
        - 3° Insere na lista de distancias
        - 4°
    //4 - pega a menor
    //5 - clusteriza o c1 e c2 da menor no novo cluster
    //6 - remove o c1 e c2 antigos da lista de clusters
    //7 - adiciona o cluster na lista

     */

    /*
    Problemas vísiveis:
        - Árvore errada: Tento mais elementos do que deveria
        - Lista de distancias gigante, não sei se tá certo
        - O NÚMERO DE CLUSTERS NÃO ESTÁ DIMINUINDO NO FINAL, por isso o loop não tá certo
        - Não acho q esteja removendo a distancia certa na remoção lá no método de clusterização
        - Está clusterizando
     */

    public int n; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
    public Ponto[] pontos;
    public List<Cluster> clusterList;
    public Cluster raizDosClusters;

    //TODO: Onde enfio esses dois?
    public List<Cluster> clusterDesativados = new ArrayList<>();
    //TODO: Dps mudar pra alguma coisa tipo distanciaAux ou algo assim, já que é um placeholder
    //public List<Distancia> distancias = new ArrayList<>();


    public Naive(int n) {
        this.n = n;
        this.pontos = new Ponto[n];
        clusterList = criarClustersIndv(this.pontos, this.n);
    }

    public static List<Cluster> criarClustersIndv(Ponto[] pontos, int limite) {
        List<Cluster> clustersIndv = new ArrayList<>();

        for (int i = 0; i < limite; i++) {
            pontos[i] = new Ponto(100);
        }

        for (Ponto ponto : pontos) {
            clustersIndv.add(new Cluster(ponto));
        }

        return clustersIndv;
    }

    public Distancia calculaDistancia() {
        //Talvez o problema é essa distancia fake nao ter c1 e c2;
        Distancia distancia_fake = new Distancia();

        for (int i = 0; i < clusterList.size() - 1; i++) {
            for (int j = i + 1; j < clusterList.size(); j++) {
                Distancia distancia = new Distancia(clusterList.get(i), clusterList.get(j));

                //TODO: Implementar achar menor distancia sem fazer lista
                //distancia_fake = distancias.get(0);
                //??????????? diz q nao tem coiso D
                    if (distancia.distancia < distancia_fake.distancia) {
                        distancia_fake = distancia;
                    }
            }
        }

        return distancia_fake;
    }

    public void removeClusters(Cluster c1, Cluster c2) {
        //TODO: Verificar se os clusters á serem removidos são da menor distancia
        clusterDesativados.add(c1);
        clusterDesativados.add(c2);
        clusterList.removeAll(clusterDesativados);

    }

    public void mostraResultados(Cluster cluster) {
        System.out.println("------------------");
        System.out.println("Árvore do cluster: " + cluster.getRaiz().contaNos());
        System.out.println("Centroide desse novo cluster: " + cluster.imprimeCentroide());
        System.out.println("------------------");
    }

    public void primeirosTestes() {

    }

    public void clusteriza() {
        //TODO: Critério de parada diferente
        //TODO: Remover AT ALL kkkkkkkkkkkkkkkkkk
            while(clusterList.size() > 1) {
                Distancia menordistancia = calculaDistancia();
                Cluster cluster = new Cluster(menordistancia.getC1(), menordistancia.getC2());

                clusterList.remove(menordistancia.getC1());
                clusterList.remove(menordistancia.getC2());
                //distancias.remove(menordistancia);

                raizDosClusters = cluster;
                clusterList.add(cluster);

                //mostraResultados(cluster);

                //interacoes--;
            }
        }

    public void getRaizDosClusters() {
        System.out.println("Contagem de nós TOTAL, Árvore geral: " + raizDosClusters.getRaiz().contaNos());
        raizDosClusters.getRaiz().mostra();
    }

    public List<Cluster> getClusterList() {
        return clusterList;
    }

    public List<Cluster> getClusterDesativados() {
        return clusterDesativados;
    }
}
