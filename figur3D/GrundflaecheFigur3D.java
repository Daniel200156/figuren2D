package figuren2D.figur3D;

import figuren2D.Figur2D;

public abstract class GrundflaecheFigur3D extends Figur3D {

    private double hoehe;
    private Figur2D grundflaeche;

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    protected Figur2D getGrundflaeche(){
        return grundflaeche;
    }

    public void setGrundflaeche(Figur2D grundflaeche) {
        this.grundflaeche = grundflaeche;
    }
}
