public class Bandingkan {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Jawa";
        String s3 = "Sumatera";

        System.out.println("\"" + s1 + "\".compareTo(" + 
                           "\"" + s2 + "\") : " +
                           s1.compareTo(s2));
        System.out.println("\"" + s1 + "\".compareTo(" + 
                           "\"" + s3 + "\") : " +
                           s1.compareTo(s3));
        System.out.println("\"" + s3 + "\".compareTo(" + 
                           "\"" + s1 + "\") : " +
                           s3.compareTo(s1));
    }
}

