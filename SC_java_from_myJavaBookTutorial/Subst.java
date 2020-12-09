public class Subst {
    public static void main(String[] args) {
        String st = "ABCDEFGHIJKLM";
        
        System.out.println("\"" + st + "\".substring(0, 1) : " + 
                           st.substring(0, 1));
        System.out.println("\"" + st + "\".substring(0, 3) : " + 
                           st.substring(0, 3));
        System.out.println("\"" + st + ".substring(2, 3) : " + 
                           st.substring(2, 3));
        System.out.println("\"" + st + ".substring(2) : " + 
                           st.substring(2));
    }
}
