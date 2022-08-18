package figuren2D.figur3D;

public abstract class GeradesPrisma extends GrundflaecheFigur3D {

    @Override
    public double flaeche() {
        return getGrundflaeche().flaeche() * getHoehe();
    }

    @Override
    public double volumen() {
        return 2 * getGrundflaeche().flaeche() + getGrundflaeche().umfang() * getHoehe();
    }

}
