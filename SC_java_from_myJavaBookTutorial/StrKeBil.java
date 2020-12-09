public class StrKeBil  {
    public static void main(String[] args) {
        String st;
        double bil;

        st = "123.45";
        bil = Double.valueOf(st);
        System.out.println("Isi bil = " + bil);
        System.out.println("Jika isi bil ditambah satu, ");
        System.out.println("isinya menjadi " + (bil + 1));
    }
}
