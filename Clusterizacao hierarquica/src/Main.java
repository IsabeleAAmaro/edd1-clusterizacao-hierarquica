public class Main {

    public static void main(String[] args) {
        int n = 10; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
        Ponto[] pontos = new Ponto[n];
        //Como é calculo do tamanho do cluster? Faz sentido pensar que eles serão de 2 em 2, porque no pseudocodigo, são únicos 2 clusters cada vez, então no inicio
        //realmente seriam 2 pontos virando 2 clusters, e 2 clusters virando 1 cluster de 4 pontos etc
        Cluster[] clusters = new Cluster[n];
        //TODO: Arraylist de clusters, pq ai tem como excluir

        //Ver mensagem para o diogo pra refletir do que porque TALVEZ o número de clusters deveria ser o mesmo que o de pontos
        // e q o número de slots ocupados vai diminuir ao longo das iterações.
        Distancia[] distancias = new Distancia[n * 2 - 1];
        //Qual tamanho?? esse é tapa buraco mas acho q deveria ser tipo isso porque..

        for (int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
            clusters[i] = new Cluster(pontos[i]);
        }

        //calcular de i pra i + 1, guarda como menor
        //calcular de i para j?
        //comparo as distancias (i + 1) e (i + j)
        //guardar o indice do menor ponto
        //clusteriza o menor ponto com outro ponto da menor distancia


        int indiceClusterIdeal = 0;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = i + 1; j < n; j++) {
                Distancia distanciaDois = new Distancia(clusters[i], clusters[j]);
                Distancia distanciaUm = new Distancia(clusters[i], clusters[i + 1]);
                double menorDistancia = Math.min(distanciaUm.calculaDistancia(), distanciaDois.calculaDistancia());

                if(distanciaUm.calculaDistancia() == menorDistancia) {
                    //FAZ SENTIDO?????
                    indiceClusterIdeal = i + 1;
                } else if(distanciaDois.calculaDistancia() == menorDistancia) {
                    //FAZ SENTIDO???
                    indiceClusterIdeal = j;
                }

                Cluster c = new Cluster(clusters[i], clusters[indiceClusterIdeal]);
                clusters[i] = c;
                //TODO: remover o antigo i do vetor de clusters
            }
        }
    }
}
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
