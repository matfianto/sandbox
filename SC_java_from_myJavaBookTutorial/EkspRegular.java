public class EkspRegular {
    public static void main(String[] args) {
        String stA = "ada deh!";
        String stB = "tiade duanye!";
        String stC = "dia!";

        System.out.println(stA.matches(".*d[aiu].*"));
        System.out.println(stB.matches(".*d[aiu].*"));
        System.out.println(stC.matches(".*d[aiu].*"));
        System.out.println(stA.matches(".*d[bcd].*"));        
    }
}
