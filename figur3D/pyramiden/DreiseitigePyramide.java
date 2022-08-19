package figuren2D.figur3D.pyramiden;

import figuren2D.Dreieck;
import figuren2D.figur3D.PyramidenartigeFigur;

public class DreiseitigePyramide<T extends Dreieck> extends PyramidenartigeFigur<T> {

    public DreiseitigePyramide(double hoehe, T grundflaeche) {
        super(hoehe, grundflaeche);
    }

    @Override
    public double mantelflaeche() {
        double sha= 0.5*Math.sqrt(2*Math.pow(getGrundflaeche().getSeiteB(),2)+2*Math.pow(getGrundflaeche().getSeiteC(),2)-Math.pow(getGrundflaeche().getSeiteA(),2)) ;
        double shb= 0.5*Math.sqrt(2*Math.pow(getGrundflaeche().getSeiteA(),2)+2*Math.pow(getGrundflaeche().getSeiteC(),2)-Math.pow(getGrundflaeche().getSeiteB(),2));
        double shc= 0.5*Math.sqrt(2*Math.pow(getGrundflaeche().getSeiteB(),2)+2*Math.pow(getGrundflaeche().getSeiteA(),2)-Math.pow(getGrundflaeche().getSeiteC(),2));

        double sa= Math.sqrt(Math.pow(getHoehe(),2)+Math.pow(2*sha, 2));
        double sb= Math.sqrt(Math.pow(getHoehe(),2)+Math.pow(2*shb, 2));
        double sc= Math.sqrt(Math.pow(getHoehe(),2)+Math.pow(2*shc, 2));

        Dreieck dreieckA= new Dreieck(getGrundflaeche().getSeiteA(), sb, sc);
        Dreieck dreieckB= new Dreieck(getGrundflaeche().getSeiteB(), sa, sc);
        Dreieck dreieckC= new Dreieck(getGrundflaeche().getSeiteC(), sb, sa);

        double flaecheDreieckA= dreieckA.flaeche();
        double flaecheDreieckB= dreieckB.flaeche();
        double flaecheDreieckC= dreieckC.flaeche();

        return flaecheDreieckA+flaecheDreieckB+flaecheDreieckC;
    }

    @Override
    public double seitenLaenge() {
        return Math.sqrt(
                Math.pow(getHoehe(), 2) + Math.pow((2 * getSh()), 2)
        );
    }

    private double getSh(){
        return 0.5 * Math.sqrt(
                2 * Math.pow(getGrundflaeche().getSeiteB(), 2) + 2
                * Math.pow(getGrundflaeche().getSeiteC(), 2)
                - Math.pow(getGrundflaeche().getSeiteA(), 2)
        );
    }

}
