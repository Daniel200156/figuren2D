package figuren2D.test;

import figuren2D.Kreis;
import figuren2D.figur3D.GrundflaecheFigur3D;
import figuren2D.figur3D.pyramiden.Kreiskegel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SomeTest {

    @Test
    public void someTest(){

        List<String> list = new ArrayList<>();

        GrundflaecheFigur3D<Kreis> kreiskegel = new Kreiskegel<>(12, new Kreis(12));

    }

}
