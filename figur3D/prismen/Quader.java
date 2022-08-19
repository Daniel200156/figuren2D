package figuren2D.figur3D.prismen;

import figuren2D.Figur2D;
import figuren2D.Quadrat;
import figuren2D.figur3D.GeradesPrisma;

public class Quader<T extends Quadrat> extends GeradesPrisma<T> {

    private String name;
    public Quader(double hoehe, T grundflaeche, String name) {
        super(hoehe, grundflaeche);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
