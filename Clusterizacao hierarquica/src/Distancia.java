public class Distancia implements Comparable<Distancia>{
    private Cluster c1, c2;
    public double distancia;

    public Cluster getC1() {
        return c1;
    }

    public Cluster getC2() {
        return c2;
    }

    public Distancia(Cluster c1, Cluster c2){
        this.c1 = c1;
        this.c2 = c2;
        this.distancia = calculaDistancia();
    }

    public Distancia(double d) {
        this.distancia = d;
    }

    public double calculaDistancia(){
        return Math.sqrt(Math.abs(Math.pow(c1.getCentroide().x - c2.getCentroide().x, 2) +  Math.pow(c1.getCentroide().y - c2.getCentroide().y, 2)));
    }

    public int compareTo(Distancia d) {
        if (distancia == d.distancia)
            return 0;
        else if (distancia > d.distancia)
            return 1;
        else
            return -1;
    }
}