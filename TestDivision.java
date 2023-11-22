import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class TestDivision {
    @BeforeAll
    public void beforAll() {
        System.out.println("Start der Test für division");
    }

    /***
     * Testet, dass zwei double Zahlen miteinander dividiert werden können.
     */
    @Test
    public void divisionDoubleDouble(){
        Division divison = new Division();
        double a = 333.56;
        double b = 2.2;
        double summe = a/b;
        Assertions.assertEquals(divison.zweiDoubleZahlen(a,b),summe, "Double und Double ist erfolgreich");
}
    /***
     * Testet, dass zwei int Zahlen miteinander dividiert werden können.
     */
    @Test
    public void divisionIntInt(){
        Division divison = new Division();
        int a = 10;
        int b = 2;
        int summe = a/b;
        Assertions.assertEquals(divison.zweiIntZahlen(a,b),summe, "Int und Int ist erfolgreich");
    }
    /***
     * Testet, dass int durch double dividiert werden kann.
     */
    @Test
    public void divisionIntDouble(){
        Division divison = new Division();
        int a = 10;
        double b = 2.5;
        double summe = a/b;
        Assertions.assertEquals(divison.intDurchDouble(a,b),summe, "Int und Double ist erfolgreich");
    }
    /***
     * Testet, dass double durch int dividiert werden kann.
     */
    @Test
    public void divisionDoubleInt(){
        Division divison = new Division();
        double a = 10.9;
        int b = 2;
        double summe = a/b;
        Assertions.assertEquals(divison.doubleDurchInt(a,b),summe, "Double und Int ist erfolgreich");
    }
    @AfterAll
    public void afterAll(){
        System.out.println("Test Division Ende");
    }
}