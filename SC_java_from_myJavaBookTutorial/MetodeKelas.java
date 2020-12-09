public class MetodeKelas {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x + "^2 = " + Rutin.kuadrat(x));
    }
}

class Rutin {
    public static int kuadrat(int x) {
        return x * x;
    }
};


