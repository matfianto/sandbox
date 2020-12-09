public class ContohFormat  {
    public static void main(String[] args) {
        String barangA = "Pasta Mirabella";
        double hargaA = 1674.25;
    
        String barangB = "Bihun AMD 100gr";
        double hargaB = 890.75;
        

        String strFormat = "| %-25s | %8.2f |";  
        System.out.println(String.format(strFormat, barangA, hargaA));
        System.out.println(String.format(strFormat, barangB, hargaB));   
    }
}
