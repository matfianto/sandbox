public class ContohBreak {
    public static void main(String[] args) {
        int bilangan = 0;
        while (bilangan < 5) {
            if (bilangan == 3)
                break;

            System.out.println(bilangan);
            bilangan++;
        }
    }
}
