package figuren2D.figur3D;

import figuren2D.N_Eck;

public abstract class GrundflaecheFigur3D extends Figur3D {

    private double hoehe;
    private N_Eck grundflaeche;

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public N_Eck getGrundflaeche() {
        return grundflaeche;
    }

    public void setGrundflaeche(N_Eck grundflaeche) {
        this.grundflaeche = grundflaeche;
    }
}
