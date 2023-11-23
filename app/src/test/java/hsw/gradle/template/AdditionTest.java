package hsw.gradle.template;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @BeforeAll
    public static void beforAll() {
        System.out.println("Start der Test für addition");
    }

    @Test
    public void additionIntInt() {
        Addition addition = new Addition();
        int a = 2;
        int b = 3;
        int summe = a + b;
        Assertions.assertEquals(addition.add(a, b), summe,
                "Int und Int ist erfrolgreich");
    }

    @Test
    public void additionIntDouble() {
        Addition addition = new Addition();
        int a = 2;
        double b = 3.22;
        double summe = a + b;
        Assertions.assertEquals(addition.add(a, b), summe,
                "Int und Double ist erfrolgreich");
    }

    @Test
    public void additionDoubleInt() {
        Addition addition = new Addition();
        double a = 2.32;
        int b = 3;
        double summe = a + b;
        Assertions.assertEquals(addition.add(a, b), summe,
                "Double und Int ist erfrolgreich");
    }

    @Test
    public void additionDoubleDouble() {
        Addition addition = new Addition();
        double a = 2.32;
        double b = 3.78;
        double summe = a + b;
        Assertions.assertEquals(addition.add(a, b), summe,
                "Double und Double ist erfrolgreich");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Addition Ende");
    }
}
