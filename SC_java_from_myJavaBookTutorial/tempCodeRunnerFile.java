System.out.println("\nPenggunaan while\nkalimat / kata yang ingin diulang = ");
        String kat = kbd.nextLine();
        System.out.print("jumlah banyak pengulangan = ");
        int t = kbd.nextInt();
        int s = 1;
        while (s <= t) {
            System.out.println(s+"."+" "+kat);
            s++;
        }