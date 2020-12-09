public class TigaDim {
    public static void main(String[] args) {
        char tigaD[][][] = new char[2][2][2];
    
        // Isikan data
        tigaD[0][0][0] = 'A';
        tigaD[0][0][1] = 'B';
        tigaD[0][1][0] = 'C';
        tigaD[0][1][1] = 'D';
        tigaD[1][0][0] = 'E';
        tigaD[1][0][1] = 'F';
        tigaD[1][1][0] = 'G';
        tigaD[1][1][1] = 'H';

        // Tampilkan isi elemen array
        System.out.println(tigaD[0][0][0]);
        System.out.println(tigaD[0][0][1]);
        System.out.println(tigaD[0][1][0]);
        System.out.println(tigaD[0][1][1]);
        System.out.println(tigaD[1][0][0]);
        System.out.println(tigaD[1][0][1]);
        System.out.println(tigaD[1][1][0]);
        System.out.println(tigaD[1][1][1]);
    }
}
