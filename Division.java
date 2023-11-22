public class Division {

    int int_a;
    int int_b;
    double double_a;
    double double_b;

    public void zweiIntZahlen(){
        if(int_b == 0){
            int ergebnis = int_a/int_b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
         System.err.println("Division durch 0 nicht möglich");
        }
    }

    public void zweiDoubleZahlen(){
        if(double_b == 0){
            double ergebnis = double_a/double_b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
    }

    public void intDurchDouble(){
        if(double_b == 0){
            double ergebnis = int_a/double_b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
    }

    public void doubleDurchInt(){
        if(int_b == 0){
            double ergebnis = double_a/int_b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
    }
}
