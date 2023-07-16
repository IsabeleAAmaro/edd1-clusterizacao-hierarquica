public class RestosDeCodigo {

    /*
    //List<Distancia> distancias = new ArrayList<>();

     */

            //distancias.add(distancia);
        /*
        for (Distancia d : distancias)
            if (d.distancia > menord.distancia)
                menord = d;
         */
//"não precisa guardar as distâncias (a cada distância calculada pode verificar se é o menor e guardar numa variável)" Como???
//pega a menor distancia


    /*
    for (int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
        }

    Cluster[] clusters = new Cluster[n];
    Distancia[] distancias = new Distancia[n * 2 - 1];
     */

    //For original que criava clusters individuais
    /*
    for (int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
            clusters[i] = new Cluster(pontos[i]);
        }
     */

    //antiga função de clusterização, nunca testada, usa vetor de clusters.
    /*
    //calcular de i pra i + 1, guarda como menor
        //calcular de i para j?
        //comparo as distancias (i + 1) e (i + j)
        //guardar o indice do menor ponto
        //clusteriza o menor ponto com outro ponto da menor distancia

        //Acho que esse j vai dar ruim sendo i + 2
        int indiceClusterIdeal = 0;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = i + 2; j < n; j++) {
                Distancia distanciaUm = new Distancia(clusters[i], clusters[i + 1]);
                Distancia distanciaDois = new Distancia(clusters[i], clusters[j]);

                //sysouts pra controle:
                System.out.println("Cluster i: " + clusters[i].getCentroide());
                System.out.println("Cluster j: " + clusters[j].getCentroide());
                System.out.println("Cluster depois do i: " + clusters[j].getCentroide());

                double menorDistancia = Math.min(distanciaUm.calculaDistancia(), distanciaDois.calculaDistancia());

                if(distanciaUm.calculaDistancia() == menorDistancia) {
                    //??
                    indiceClusterIdeal = i + 1;
                } else if(distanciaDois.calculaDistancia() == menorDistancia) {
                    //??
                    indiceClusterIdeal = j;
                }

                Cluster c = new Cluster(clusters[i], clusters[indiceClusterIdeal]);
                clusters[i] = c;
                System.out.println("Centroide do novo cluster: " + c.getCentroide());
                //TODO: remover o antigo i do vetor de clusters
            }
     */


                /*
        while (n < clusters.length) {
           Cluster cluster = new Cluster()
        }
         */
//Acho que só tá dando esse erro porque ?????

//1 - calcula a menor distancia?
//2 - clusteriza
//METODO DE PARADA: enquanto nao chegar no limite de clusters

        /*
        ENQUANTO não atingiu o critério de parada FAÇA
        Pegue os dois melhores clusters para combinar;
        Combine esses dois clusters em um só cluster;
        FIM-ENQUANTO
        /*
    }
}
         */

//Esse min é tapa buraco, porque é mais ou menos nesse modelo que eu to pensando, de calcular 2 distancias
//Talvez o melhor seja isso aqui (min de duas distancias), mas como eu boto a distancias pra calcularem a distancia do cluster x pro mais proximo que eu nao conheco?
//tipo seleciono um ponto aleatório e começo a achar o vizinho dele, faço isso até todo mundo ter vizinho?????
//guardar indice do menor ponto -> cluster associada á menor distancia?
//distancias[i] = distanciaClusters;
//Math.min(distancias[i].calculaDistancia(), distancias[j].calculaDistancia());
        /*
        while (n < clusters.length) {
            //Como combinar clusters?
            Cluster c = new Cluster()
        }
         */


    //off: pq distancias nao podem ser vetor? Pq não colocar como função?
    //Nosso calculo de distancias talvez esteja errado
    //1 - faz pontos com aleatorio OK
    //2 - inicializa como cluster OK
    //3 - calcula distancias
    //4 - pega a menor
    //5 - clusteriza o c1 e c2 da menor no novo cluster
    //6 - remove o c1 e c2 antigos da lista de clusters
    //7 - adiciona o cluster na lista


    /*
            for(int i = 0; i < clusterList.size(); i++) {
            for(int j = i + 1; j < clusterList.size(); j++) {
                Distancia distancia = new Distancia(clusterList.get(i), clusterList.get(j));

                if(distancia.distancia < menord.distancia) {
                    menord = distancia;

                }
            }
        }
     */


    /*
    VERSAO 19H09:
        public Distancia calculaDistancia() {
        //Talvez o problema é essa distancia fake nao ter c1 e c2;
        Distancia distancia_fake = new Distancia();

        for (int i = 0; i < clusterList.size() - 1; i++) {
            for (int j = i + 1; j < clusterList.size(); j++) {
                Distancia distancia = new Distancia(clusterList.get(i), clusterList.get(j));
                distancias.add(distancia);

                //TODO: Implementar achar menor distancia sem fazer lista
                distancia_fake = distancias.get(0);
                //??????????? diz q nao tem coiso D
                for (Distancia distancila : distancias)
                    if (distancia.distancia < distancia_fake.distancia) {
                        distancia_fake = distancia;
                    }
            }
        }

        return distancia_fake;
    }
     */


    /*
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

}
