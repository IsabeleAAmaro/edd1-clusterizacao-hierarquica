import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainNaive {
    public static void main(String[] args)  {
            int n = 50000; // 10, 20, 30, 40, 50, 100, 200, 500, 1.000, 5.000, 10.000, 20.000, 50.000 e 100.000
            int numExecucoes = 10;

            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter("resultados.txt"));

                for (int i = 0; i < numExecucoes; i++) {
                    long tempoInicio = System.currentTimeMillis();
                    Naive algoritmoNaive = new Naive(n);
                    algoritmoNaive.clusteriza();
                    long tempoFim = System.currentTimeMillis();
                    long duracao = (tempoFim - tempoInicio);

                    writer.write("Execução " + (i + 1) + ": " + duracao + " ms\n");
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