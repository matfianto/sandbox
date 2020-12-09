public class StrSama2 {
    public static void main(String[] args) {
        String str1, str2, str3;

        str1 = "Tes..tes..123";
        str2 = "TES..TES..123";
        str3 = str1;

        // Tes 1
        System.out.print("\"" + str1 + "\" dan \"" +
                         str2 + "\" : ");
        if (str1.equalsIgnoreCase(str2))
            System.out.println("sama");
        else
            System.out.println("tidak sama");

        // Tes 2
        System.out.print("\"" + str1 + "\" dan \"" +
                         str3 + "\" : ");
        if (str1.equalsIgnoreCase(str3))
            System.out.println("sama");
        else
            System.out.println("tidak sama");   
    }
}
