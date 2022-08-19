package figuren2D.figur3D.pyramiden;

import figuren2D.Figur2D;
import figuren2D.Kreis;
import figuren2D.figur3D.PyramidenartigeFigur;

public class Kreiskegel<T extends Kreis> extends PyramidenartigeFigur<T> {

    public Kreiskegel(double hoehe, T grundflaeche) {
        super(hoehe, grundflaeche);
    }

    @Override
    public double mantelflaeche() {
        return getGrundflaeche().getRadius() * seitenLaenge() * Math.PI;
    }

    @Override
    public double seitenLaenge() {
        return Math.sqrt(Math.pow(getHoehe(), 2) + Math.pow(getGrundflaeche().getRadius(), 2));
    }

}
