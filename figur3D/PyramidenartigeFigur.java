package figuren2D.figur3D;

import figuren2D.Figur2D;

public abstract class PyramidenartigeFigur<T extends Figur2D> extends GrundflaecheFigur3D<T> {

    public PyramidenartigeFigur(double hoehe, T grundflaeche) {
        super(hoehe, grundflaeche);
    }

    public abstract double mantelflaeche();
    public abstract double seitenLaenge();

    @Override
    public double volumen() {
        return (getGrundflaeche().flaeche() * getHoehe())/3;
    }

    @Override
    public double flaeche() {
        return getGrundflaeche().flaeche() + mantelflaeche();
    }
}
