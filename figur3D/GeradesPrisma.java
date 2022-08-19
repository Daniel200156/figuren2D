package figuren2D.figur3D;

import figuren2D.Figur2D;

public abstract class GeradesPrisma<T extends Figur2D> extends GrundflaecheFigur3D<T> {

    public GeradesPrisma(double hoehe, T grundflaeche) {
        super(hoehe, grundflaeche);
    }

    @Override
    public double flaeche() {
        return getGrundflaeche().flaeche() * getHoehe();
    }

    @Override
    public double volumen() {
        return 2 * getGrundflaeche().flaeche() + getGrundflaeche().umfang() * getHoehe();
    }

}
