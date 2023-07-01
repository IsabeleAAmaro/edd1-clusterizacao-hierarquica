import java.util.Random;

public class Ponto {
    public int x;
    public int y;
    Random r = new Random();

    public Ponto(int limite) {
        x = r.nextInt(limite);
        y = r.nextInt(limite);
    }

    public void getCoordenada() {
        System.out.println("(" + x + "," + y + ")");
    }

    public void getCentroide(Ponto[] p) {
        //TO DO
    }
}
