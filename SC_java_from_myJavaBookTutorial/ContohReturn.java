public class ContohReturn {
    public static void main(String[] args) {
        tampilkan("Tes..Tes..123!");
        System.out.println("------------");
        tampilkan("");
    }

    public static void tampilkan(String x) {
        if (x.length() == 0) {
            System.out.println("Cobalah untuk tidak memberikan argumen");
            System.out.println("berupa string kosong");

            return;  // Akhiri metode
        }

        // Tampilkan
        System.out.print("Argumen: ");
        System.out.println(x);
   }
}
