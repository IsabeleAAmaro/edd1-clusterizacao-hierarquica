import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
            int n = 10;
            int numExecucoes = 10;

            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter("resultados.txt"));

                for (int i = 0; i < numExecucoes; i++) {
                    long tempoInicio = System.nanoTime();
                    Naive algoritmoNaive = new Naive(n);
                    algoritmoNaive.clusteriza();
                    long tempoFim = System.nanoTime();
                    long duracao = (tempoFim - tempoInicio) / 1_000_000;

                    writer.write("Execução " + (i + 1) + ": " + duracao + " ms\n");
                    algoritmoNaive.getRaizDosClusters();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }