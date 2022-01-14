public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        
        long inicio = System.currentTimeMillis();

        for (int i=1; i<50; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 3ms, 1000 => 4ms,  10000 => 105ms, 100000 =>
            //c += a + b +"\n";                       //500 => 19,  1000 => 21ms  10000 => 68ms,  100000 =>
            /* sb.append(a);
               sb.append(b);                          //500 => 0ms, 1000 => 0ms   10000 => 2ms,   100000 =>
               sb.append("\n");
            */
            sb.append(a).append(b).append("\n");
        
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("StringBuilder = " + sb.toString());
    }
}
