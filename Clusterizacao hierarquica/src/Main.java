public class Main {

    public static void main(String[] args) {
        int n = 10; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
        Ponto[] pontos = new Ponto[n];
        Cluster[] clustersIndividuais = new Cluster[n]; //n eh o tapa buraco aqui
        //Distancia[] distancias = new Distancia[n]; //n eh o tapa buraco aqui

        for(int i = 0; i < n; i++) {
            pontos[i] = new Ponto(n);
            clustersIndividuais[i] = new Cluster(pontos[i]);
        }

        //metodo que combina dois clusters individuais
        //como remover do vetor clustersIndividuais?

        do {


        }while (clustersIndividuais.length == 0);


    }
}
