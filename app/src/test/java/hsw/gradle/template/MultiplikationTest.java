package hsw.gradle.template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MultiplikationTest {
    @BeforeAll
    public static void beforAll() {
        System.out.println("Start der Test für multiplikation");
    }

//    @Test
//    public void multiplikationIntInt() {
//        Multiplikation multiplikation = new Multiplikation();
//        int a = 2;
//        int b = 3;
//        int produkt = a * b;
//        Assertions.assertEquals(multiplikation.multiply(a, b), produkt,
//                "Int und Int ist erfrolgreich");
//    }
//
//    @Test
//    public void multiplikationIntDouble() {
//        Multiplikation multiplikation = new Multiplikation();
//        int a = 2;
//        double b = 3.22;
//        double produkt = a * b;
//        Assertions.assertEquals(multiplikation.multiply(a, b), produkt,
//                "Int und Double ist erfrolgreich");
//    }
//
//    @Test
//    public void multiplikationDoubleInt() {
//        Multiplikation multiplikation = new Multiplikation();
//        double a = 2.32;
//        int b = 3;
//        double produkt = a * b;
//        Assertions.assertEquals(multiplikation.multiply(a, b), produkt,
//                "Double und Int ist erfrolgreich");
//    }
//
//    @Test
//    public void multiplikationDoubleDouble() {
//        Multiplikation multiplikation = new Multiplikation();
//        double a = 2.32;
//        double b = 3.78;
//        double produkt = a * b;
//        Assertions.assertEquals(multiplikation.multiply(a, b), produkt,
//                "Double und Double ist erfrolgreich");
//    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Multiplikation Ende");
    }
}
