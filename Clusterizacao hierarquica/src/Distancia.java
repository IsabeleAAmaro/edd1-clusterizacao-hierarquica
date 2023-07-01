import java.lang.Math;

public class Distancia {

    public double media;
    //talvez declarar clusters aqui?

    public Distancia(Ponto p, Ponto q) {
        //repensar isso dps
        this.media = Math.sqrt((p.x - q.x) + (p.y - q.y));
    }

    //Clusterizar = achar o centroide entre dois clusters?
    public double distanciaCentroides() {
        double d = 0;

        return d;
    }
}
