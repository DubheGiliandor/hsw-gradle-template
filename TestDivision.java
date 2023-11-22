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
    @AfterAll
    public void afterAll(){
        System.out.println("Test Division Ende");
    }
}