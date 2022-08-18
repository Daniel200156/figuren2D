package figuren2D.figur3D.pyramiden;

import figuren2D.Kreis;
import figuren2D.figur3D.PyramidenartigeFigur;

public class Kreiskegel extends PyramidenartigeFigur {

    @Override
    protected Kreis getGrundflaeche() {
        return (Kreis) super.getGrundflaeche();
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
