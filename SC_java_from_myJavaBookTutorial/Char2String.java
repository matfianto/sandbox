public class Char2String {
    public static void main(String[] args) {
        char[] daftar = {'A', 'B', 'C', 'D', 'E'};

        String hasil = String.copyValueOf(daftar);  
        System.out.println(hasil);   
    }
}
