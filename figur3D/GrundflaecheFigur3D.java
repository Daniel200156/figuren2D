package figuren2D.figur3D;

import figuren2D.Figur2D;
import figuren2D.figur3D.exceptions.FuckYouException;

public abstract class GrundflaecheFigur3D<T extends Figur2D> extends Figur3D {

    public GrundflaecheFigur3D(double hoehe, T grundflaeche) {
        this.hoehe = hoehe;
        this.grundflaeche = grundflaeche;
    }

    private double hoehe;
    private T grundflaeche;

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        if (this.hoehe < 0) {
            throw new FuckYouException();
        }
        this.hoehe = hoehe;
    }

    protected T getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(T grundflaeche) {
        this.grundflaeche = grundflaeche;
    }
}
