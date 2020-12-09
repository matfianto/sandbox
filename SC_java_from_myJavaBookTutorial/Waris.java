public class Waris {
    public static void main(String[] args) {
        // Pembuatan objek
        MilikkuSendiri bendaku = new MilikkuSendiri();

        // Info
        bendaku.info();
    }
}

// Superkelas
class DariOrtu {
    private int uang;
    private String mobil;
    public DariOrtu() {
        uang = 500000;
        mobil = "Honda Jazz";
    }

    public void info() {
        System.out.println("Uang  : " + uang);
        System.out.println("Mobil : " + mobil);
    }
};

// Subkelas
class MilikkuSendiri extends DariOrtu {
    private String sepeda;
    public MilikkuSendiri() {
        sepeda = "Pacific X233";
    }

    public void info() {
        super.info();
        System.out.println("Sepeda: " + sepeda);
    }
};

