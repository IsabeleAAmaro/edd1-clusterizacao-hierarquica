public class RestosDeCodigo {

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

}