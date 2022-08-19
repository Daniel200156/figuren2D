package figuren2D.figur3D.pyramiden;

import figuren2D.Rechteck;
import figuren2D.figur3D.PyramidenartigeFigur;

public class VierseitigePyramide<T extends Rechteck> extends PyramidenartigeFigur<T> {

    public VierseitigePyramide(double hoehe, T grundflaeche) {
        super(hoehe, grundflaeche);
    }

    @Override
    public double mantelflaeche() {
        return 2 * (getFlaecheDreieck(getGrundflaeche().getBreite()) + getFlaecheDreieck(getGrundflaeche().getHoehe()));
    }

    @Override
    public double seitenLaenge() {
        return Math.sqrt(
                Math.pow(getHoehe(), 2) + Math.pow((getDiagonale() / 2), 2)
        );
    }

    private double getDiagonale() {
        return Math.sqrt(
                Math.pow(getGrundflaeche().getHoehe(), 2) + Math.pow(getGrundflaeche().getBreite(), 2)
        );
    }

    private double getFlaecheDreieck(double seite) {
        double s = (seite + seitenLaenge() + seitenLaenge()) / 2;
        return Math.sqrt(
                s * (s - seite) * (s - seitenLaenge()) * (s - seitenLaenge())
        );
    }

}
