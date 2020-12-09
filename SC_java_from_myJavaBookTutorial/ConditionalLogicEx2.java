import java.util.Scanner;
public class ConditionalLogicEx2 {

    public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		boolean pernahCuti = false;
		int jumlahSksLulus = 110;
		char a = 'y';
		while (a == 'y') {
			if(pernahCuti) {
			if(jumlahSksLulus < 120) {
				System.out.println("Kamu DO!");
			}
			else{
				System.out.println("Kamu Tidak Jadi DO!");
			}
		}
		else{
			if(jumlahSksLulus < 144) {
				System.out.println("Kamu DO!");
			}
			else{
				System.out.println("Kamu Tidak Jadi DO!");
			}
		}
		} System.out.println("kshiahxa :" );
		a = kbd.next.chatAt(0);
	}

}

