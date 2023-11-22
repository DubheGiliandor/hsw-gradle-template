package hsw.gradle.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @BeforeAll
    public void beforAll() {
        System.out.println("Start der Test für addition");
    }

    @Test
    public void additionIntInt() {
        Addition addition = new Addition();
        int a = 2;
        int b = 3;
        int summe = 2 + 3;
        Assertions.assertEquals(addition.add(a, b), summe,
                "Int und Int ist erfrolgreich");
    }
}
