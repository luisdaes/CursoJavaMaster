public class OperadoresIncrementales {

    public static void main(String[] args) {

        // PRE-incremento
        int i = 1;
        int j = ++i; // i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST-incremento
        i = 2;
        j = i++; // i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // PRE-decremento
        i = 3;
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //POST-decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
        
        
    }
}