import java.util.Random;
public class Ponto {

    //Atributos publicos, pra nao usar get
    public double x;
    public double y;
    Random r = new Random();

    //Novo ponto
    public Ponto(int limite) {
        x = r.nextInt(limite);
        y = r.nextInt(limite);
    }

    //Novo centroide
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}