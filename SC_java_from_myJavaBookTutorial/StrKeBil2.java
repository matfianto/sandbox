public class StrKeBil2  {
    public static void main(String[] args) {
        String st;
        double bil = 0;

        // Tes 1
        st = "123.45";

        System.out.println("Tes 1");
        System.out.println("Isi St = \"" + st + "\"");
        try {
            bil = Double.valueOf(st);
            System.out.println("Isi bil = " + bil);
        }
        catch (Exception e) {
            System.out.println("Isi st invalid");
        }

        // Test 2   
        st = "    123.45  ";

        System.out.println("Tes 2");
        System.out.println("Isi St = \"" + st + "\"");

        try {
            bil = Double.valueOf(st);
            System.out.println("Isi bil = " + bil);
        }
        catch (Exception e) {
            System.out.println("Isi st invalid");
        }

        // Test 3
        st = "123.45abc";

        System.out.println("Tes 3");
        System.out.println("Isi St = \"" + st + "\"");

        try {
            bil = Double.valueOf(st);
            System.out.println("Isi bil = " + bil);
        }
        catch (Exception e) {
            System.out.println("Isi st invalid");
        }
    }
}
