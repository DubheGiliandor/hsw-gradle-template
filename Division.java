public class Division {

    public int zweiIntZahlen(int a, int b){
        int ergebnis= 0;
        if(b == 0){
             ergebnis = a/b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
         System.err.println("Division durch 0 nicht möglich");
        }
        return ergebnis;
    }

    public double zweiDoubleZahlen(double a, double b){
        double ergebnis= 0;
        if(b == 0){
             ergebnis = a/b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
        return ergebnis;
    }

    public double intDurchDouble( int a, double b){
        double ergebnis = 0;
        if(b == 0){
             ergebnis = a/b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
        return ergebnis;
    }

    public double doubleDurchInt(double a, int b){
        double ergebnis = 0;
        if(b == 0){
             ergebnis = a/b;
            System.out.println("Das Ergebnis lautet: "+ ergebnis);
        }else{
            System.err.println("Division durch 0 nicht möglich");
        }
        return ergebnis;
    }
}
