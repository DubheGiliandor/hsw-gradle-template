public class Division {

    /***
     * Eine int Zahl wird durch eine int Zahl dividiert
     */
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

    /***
     * Eine double Zahl wird durch eine double Zahl dividiert
     */
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

    /***
     * Eine int Zahl wird durch eine double Zahl dividiert
     */
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

    /***
     * Eine double Zahl wird durch eine int Zahl dividiert
     */
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
