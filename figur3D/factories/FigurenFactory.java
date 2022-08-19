package figuren2D.figur3D.factories;

import figuren2D.Dreieck;
import figuren2D.Kreis;
import figuren2D.Rechteck;
import figuren2D.figur3D.Figur;
import figuren2D.figur3D.pyramiden.DreiseitigePyramide;
import figuren2D.figur3D.pyramiden.Kreiskegel;
import figuren2D.figur3D.pyramiden.VierseitigePyramide;

import java.util.Objects;

public class FigurenFactory {

    public static Figur createKreiskegel(double hoehe, Kreis kreis){
        return new Kreiskegel<>(hoehe, kreis);
    }

    public static Figur createKreiskegel(double hoehe, double radius){
        return new Kreiskegel<>(hoehe, new Kreis(radius));
    }

    public static Figur createVierseitigePyramide(double hoehe, Rechteck rechteck){
        return new VierseitigePyramide<>(hoehe, rechteck);
    }

    public static Figur createVierseitigePyramide(double hoehe, double rechteckHoehe, double rechteckBreite){
        return new VierseitigePyramide<>(hoehe, new Rechteck(rechteckHoehe, rechteckBreite));
    }

    public static Figur createDreiseitigePyramide(double hoehe, Dreieck dreieck){
        return new DreiseitigePyramide<>(hoehe, dreieck);
    }

    public static Figur createDreiseitigePyramide(double hoehe, double seiteA, double seiteB, double seiteC){
        return new DreiseitigePyramide<>(hoehe, new Dreieck(seiteA, seiteB, seiteC));
    }

}
