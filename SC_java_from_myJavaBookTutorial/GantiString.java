public class GantiString {
    public static void main(String[] args) {
        String st = "kukuku kaku kaku!";
        
        // Ganti substring
        System.out.println(st.replaceAll("k[ua]", "bi"));
        System.out.println(st.replaceFirst("k[ua]", "bi"));
               
        // Hapus substring "uk"
        System.out.println(st.replaceAll("uk", ""));
    }
}
