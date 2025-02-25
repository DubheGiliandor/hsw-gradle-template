/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hsw.gradle.template;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello and welcome!");
        Addition add = new Addition();
        Subtraktion subtract = new Subtraktion();
        Multiplikation multiply = new Multiplikation();
        Division divide = new Division();
        int int_a = 4;
        int int_b = 8;
        double double_a = 3.5;
        double double_b = 10.5;

        int result1 = add.add(int_a, int_b);
        double result2 = add.add(int_a, double_b);
        double result3 = add.add(double_a, int_b);
        double result4 = add.add(double_a, double_b);

        int result5 = subtract.subtract(int_a, int_b);
        double result6 = subtract.subtract(int_a, double_b);
        double result7 = subtract.subtract(double_a, int_b);
        double result8 = subtract.subtract(double_a, double_b);

        int result9 = multiply.multiply(int_a, int_b);
        double result10 = multiply.multiply(int_a, double_b);
        double result11 = multiply.multiply(double_a, int_b);
        double result12 = multiply.multiply(double_a, double_b);

        int result13 = divide.divide(int_a, int_b);
        double result14 = divide.divide(int_a, double_b);
        double result15 = divide.divide(double_a, int_b);
        double result16 = divide.divide(double_a, double_b);

        try {
            System.out.println("Ergebnisse der Addition");
            System.out.println(int_a + " + " + int_b + " = " + result1);
            System.out.println(int_a + " + " + double_b + " = " + result2);
            System.out.println(double_a + " + " + int_b + " = " + result3);
            System.out.println(double_a + " + " + double_b + " = " + result4);
        } catch (Exception e) {
            System.out.println("Fehler bei der Addition");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Ergebnisse der Subtrahierung");
            System.out.println(int_a + " - " + int_b + " = " + result5);
            System.out.println(int_a + " - " + double_b + " = " + result6);
            System.out.println(double_a + " - " + int_b + " = " + result7);
            System.out.println(double_a + " - " + double_b + " = " + result8);
        } catch (Exception e) {
            System.out.println("Fehler bei der Subtrahierung");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Ergebnisse der Multiplikation");
            System.out.println(int_a + " * " + int_b + " = " + result9);
            System.out.println(int_a + " * " + double_b + " = " + result10);
            System.out.println(double_a + " * " + int_b + " = " + result11);
            System.out.println(double_a + " * " + double_b + " = " + result12);
        } catch (Exception e) {
            System.out.println("Fehler bei der Multiplikation");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Ergebnisse der Division");
            System.out.println(int_a + " / " + int_b + " = " + result13);
            System.out.println(int_a + " / " + double_b + " = " + result14);
            System.out.println(double_a + " / " + int_b + " = " + result15);
            System.out.println(double_a + " / " + double_b + " = " + result16);
        } catch (Exception e) {
            System.out.println("Fehler bei der Division");
            System.out.println(e.getMessage());
        }
    }
}
