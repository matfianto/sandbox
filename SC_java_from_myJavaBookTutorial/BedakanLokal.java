public class BedakanLokal {
    static int z = 99;

    public static void main(String[] args) {
        int z = 77; // Lokal

        System.out.println("z lokal = " + z);
        System.out.println("z kelas = " + BedakanLokal.z);
    }
}
