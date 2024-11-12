package tests;

import controller.Polyglot2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Polyglot2Test {

    @Test
    void testCountRatingEqual5ByNutFusion() {
        Polyglot2 app = new Polyglot2();
        int total = app.countRatingEqual5ByBrand("NutFusion");
        assertEquals(6, total);
    }

    @Test
    void testCountRatingEqual5ByPastaPro() {
        Polyglot2 app = new Polyglot2();
        int total = app.countRatingEqual5ByBrand("PastaPro");
        assertEquals(13, total);
    }

    @Test
    void testCountRatingEqual5ByChocoLux() {
        Polyglot2 app = new Polyglot2();
        int total = app.countRatingEqual5ByBrand("ChocoLux");
        assertEquals(12, total);
    }
}
