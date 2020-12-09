class NestedLoop {
	public static void main(String[] args) {
		// yg pertama ini hanya statement print coba2 kok :p
		System.out.println(0123+3210);

		// for pertama untuk membuat baris
		for (int i = 1; i <= 5; i++) {

			// for kedua untuk mencetak angka di setiap baris
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}

			// println terakhir untuk mencetak secara vertikal
			System.out.println("");

		}
	}
}