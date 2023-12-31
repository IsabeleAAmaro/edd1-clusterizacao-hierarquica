import java.util.Random;
public class Ponto {

    //Atributos publicos, pra nao usar get
    public double x;
    public double y;
    Random r = new Random();

    //Novo ponto
    public Ponto(int limite) {
        x = r.nextInt(limite) + 1;
        y = r.nextInt(limite) + 1;
    }

    //Novo centroide
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}