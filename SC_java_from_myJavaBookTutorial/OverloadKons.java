public class OverloadKons {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil minibus = new Mobil("Avanza", "Toyota", 1300);
        Mobil sedan = new Mobil("City", "Honda");

        // Tampilkan data
        System.out.println("Minibus:");
        System.out.println("Jenis : " +
                           minibus.perolehJenis());
        System.out.println("Merk  : " +
                           minibus.perolehMerek());
        System.out.println("CC    : " +
                           minibus.perolehCC());

        System.out.println();
        System.out.println("Sedan:");
        System.out.println("Jenis : " +
                           sedan.perolehJenis());
        System.out.println("Merk  : " +
                           sedan.perolehMerek());
        System.out.println("CC    : " +
                           sedan.perolehCC());
    }
}

// -------- Definisi kelas Mobil
class Mobil {
    private String jenis;
    private String merek;
    private int cc;
 
    public Mobil(String jenis, String merek, int cc) {
    	this.jenis = jenis;
    	this.merek = merek;
    	this.cc = cc;
    }

    public Mobil(String jenis, String merek) {
    	this.jenis = jenis;
    	this.merek = merek;
    	this.cc = 0;
    }

    public String perolehJenis() {
    	return jenis;
    }
    
    public String perolehMerek() {
        return merek;
    }

    public int perolehCC() {
        return cc;
    }
};

