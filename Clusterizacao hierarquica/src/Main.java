public class Main {

    public static void main(String[] args) {
        int n = 10; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
        Ponto[] pontos = new Ponto[n];
        Cluster[] clusters = new Cluster[n * 2 - 1];

        for (int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
            clusters[i] = new Cluster(pontos[i]);
        }

        for (int i = 0; i < (n - 1); i++) {
            //Precisa desse cálculo na assinatura do segundo for??
            for (int j = i + 1; j < n; j++) {
                Distancia distanciaClusters = new Distancia(clusters[i], clusters[j]);
                Double menorDistancia = distanciaClusters.calculaDistancia();
                //Como armazenar a menor distancia possivel? Para usar no loop de clusterização?
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
}
