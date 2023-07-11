public class Distancia implements Comparable<Distancia>{

    private Cluster c1, c2;
    private double distancia;

    public Cluster getC1() {
        return c1;
    }

    public void setC1(Cluster c1) {
        this.c1 = c1;
    }

    public Cluster getC2() {
        return c2;
    }

    public void setC2(Cluster c2) {
        this.c2 = c2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Distancia(Cluster c1, Cluster c2){
        this.c1 = c1;
        this.c2 = c2;
        this.distancia = calculaDistancia();
    }

    public double calculaDistancia(){
        return Math.sqrt(Math.abs(Math.pow(c1.getCentroide().getX() - c2.getCentroide().getX(), 2) +  Math.pow(c1.getCentroide().getY() - c2.getCentroide().getY(), 2)));
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