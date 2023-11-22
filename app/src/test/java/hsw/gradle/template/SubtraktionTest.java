package hsw.gradle.template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SubtraktionTest {

    @BeforeAll
    public static void beforAll() {
        System.out.println("Start der Test für Subtraktion");
    }

    @Test
    public void subtraktionIntInt() {
        Subtraktion subtract = new Subtraktion();
        int a = 11;
        int b = 4;
        int differenz = a - b;
        Assertions.assertEquals(subtract.subtract(a, b), differenz, "Subtraktion der beiden Int erfolgreich");
    }

    @Test
    public void subtraktionIntDouble() {
        Subtraktion subtract = new Subtraktion();
        int a = 11;
        double b = 4;
        double differenz = a - b;
        Assertions.assertEquals(subtract.subtract(a, b), differenz, "Subtraktion des Doubles vom Int erfolgreich");
    }

    @Test
    public void subtraktionDoubleInt() {
        Subtraktion subtract = new Subtraktion();
        double a = 11;
        int b = 4;
        double differenz = a - b;
        Assertions.assertEquals(subtract.subtract(a, b), differenz, "Subtraktion des Int vom Double erfolgreich");
    }


    @AfterAll
    public void afterAll(){
        System.out.println("Ende des Tests für Subtraktion");
    }
}