public class WarisArg {
    public static void main(String[] args) {
        // Pembuatan objek
        PegawaiAsing insinyur = new PegawaiAsing(
            "14567", "Robert Dafore", "A12345");

        // Info
        insinyur.info();
    }
}

// Superkelas
class Pegawai {
    protected String nip;
    protected String nama;
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void info() {
        System.out.println("NIP     : " + nip);
        System.out.println("Nama    : " + nama);
    }
};

// Subkelas
class PegawaiAsing extends Pegawai {
    private String noPaspor;
    public PegawaiAsing(String nip, String nama, String noPaspor) {
        super(nip, nama);
        this.noPaspor = noPaspor;
    }

    public void info() {
        super.info();
        System.out.println("Passpor : " + noPaspor);
    }
};

