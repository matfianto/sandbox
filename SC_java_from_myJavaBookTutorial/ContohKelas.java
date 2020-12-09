public class ContohKelas {
    public static void main(String[] args) {
        // Pembuatan objek
        Mobil minibus = new Mobil();
        Mobil sedan = new Mobil();

        // Isikan data
        minibus.isikanJenis("Avanza");
        minibus.isikanMerek("Toyota");
        minibus.isikanCC(1300);

        sedan.isikanJenis("City");
        sedan.isikanMerek("Honda");
        sedan.isikanCC(1600);

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
 
    public void isikanJenis(String jenis) {
    	this.jenis = jenis;
    }

    public void isikanMerek(String merek) {
    	this.merek = merek;
    }
    
    public void isikanCC(int cc) {
    	this.cc = cc;
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

