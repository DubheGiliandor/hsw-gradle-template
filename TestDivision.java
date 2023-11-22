import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

public class TestDivision {
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
    @Test
    public void divisionIntInt(){
        Division divison = new Division();
        int a = 10;
        int b = 2;
        int summe = a/b;
        Assertions.assertEquals(divison.zweiDoubleZahlen(a,b),summe, "Int und Int ist erfolgreich");
    }
    @Test
    public void divisionIntDouble(){
        Division divison = new Division();
        int a = 10;
        double b = 2.5;
        double summe = a/b;
        Assertions.assertEquals(divison.zweiDoubleZahlen(a,b),summe, "Int und Double ist erfolgreich");
    }
    @Test
    public void divisionDoubleInt(){
        Division divison = new Division();
        double a = 10.9;
        int b = 2;
        double summe = a/b;
        Assertions.assertEquals(divison.zweiDoubleZahlen(a,b),summe, "Double und Int ist erfolgreich");
    }

    @AfterAll
    public void afterAll(){
        System.out.println("Test Division Ende");
    }
}