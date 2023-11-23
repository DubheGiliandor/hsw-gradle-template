package hsw.gradle.template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        int c = 7;
        assertEquals(subtract.subtract(a,b), c);
    }

    @Test
    public void subtraktionIntDouble() {
        Subtraktion subtract = new Subtraktion();
        int a = 11;
        double b = 4;
        double c = 7;
        assertEquals(subtract.subtract(a,b),c);
    }

    @Test
    public void subtraktionDoubleInt() {
        Subtraktion subtract = new Subtraktion();
        double a = 11;
        int b = 4;
        double c = 7;
        assertEquals(subtract.subtract(a,b),c);
    }

    @Test
    public void subtraktionDoubleDouble() {
        Subtraktion subtract = new Subtraktion();
        double a = 11;
        double b = 4;
        double c = 7;
        assertEquals(subtract.subtract(a,b),c);
    }


    @AfterAll
    public static void afterAll(){
        System.out.println("Ende des Tests für Subtraktion");
    }
}