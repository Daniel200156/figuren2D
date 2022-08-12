package figuren2D.figur3D;

public abstract class PyramidenartigeFigur extends GrundflaecheFigur3D {

    public abstract double mantelflaeche();
    public abstract double seitenLaenge();

    @Override
    public double volumen() {
//        return (getGrundflaeche() * getHoehe())/3;
        return 0;
    }

    @Override
    public double flaeche() {
//        return getGrundflaeche() + mantelflaeche();
        return 0;
    }
}
