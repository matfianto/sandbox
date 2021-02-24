using System;

class MainClass {
    // TODO 1: Definisikan variabel global yang diperlukan di bawah ini ya. 
  static int batu = 0;
  static int kertas = 1;
  static int gunting = 2;
  static int playerScore = 0;
  static int enemyScore = 0;
  static int playerSign = 0;
  static int enemySign = 0;

  static void Main() {

    Console.WriteLine("Selamat Datang di permainan Batu Kertas Gunting");
    Console.WriteLine("Masukkan angka pada bagian input dan pisahkan dengan Enter. Keterangannya di bawah ini:");
    Console.WriteLine(" 0 = batu,\n 1 = kertas,\n 2 = gunting.\n");
    Console.WriteLine("Selamat bermain\n");

    int round = 1;
    while(round < 6){
      Console.WriteLine("Ronde " + round);

        // TODO 2: Buat fungsi untuk menangkap input player
      playerSign = Int32.Parse(Console.ReadLine());
    // Console.WriteLine("Anda memilih " + playerSign);

        // TODO 3: Buat fungsi random untuk jawaban dari enemy dan lakukan pengecekan dengan memanggil fungsi CompareSigns
      Random r = new Random();
      enemySign = r.Next(0,3);
    // Console.WriteLine("Musuh memilih " + enemySign);
      CompareSigns();

        // TODO 4: Tampilkan pilihan dari player dan enemy yang sudah diterjemahkan dengan memanggil TranslatePlayerSign dan TranslateEnemySign.
      TranslatePlayerSign();
      TranslateEnemySign();

      
      round++;

        // TODO 5: Tampilkan skor sementara dengan memanggil fungsi ShowScore
      ShowScore();

        /* TODO 6: Buat perulangan untuk menghitung ronde.
        Di dalam perulangan isi dengan beberapa statement sebelumnya antara lain:
          1. Menangkap input player
          2. Buat fungsi random untuk enemy
          3. Pengecekan pilihan dari player dan enemy dengan memanggil fungsi CompareSigns
          4. Tampilkan pilihan dari player dan enemy yang sudah diterjemahkan dengan memanggil TranslatePlayerSign dan TranslateEnemySign
          5. Tampilkan skor sementara dengan memanggil fungsi ShowScore
 
        Di luar perulangan tambahkan statement berikut.
          1. Cetak pesan bahwa game selesai.
          2. Tampilkan skor akhir dengan memanggil fungsi CheckFinalScore.          
        */   
  Console.WriteLine(); // mencetak baris kosong supaya lebih rapi.
}
Console.WriteLine("Game Selesai");
CheckFinalScore();
}

public static void CompareSigns(){
       // TODO 3: Buat fungsi untuk mengecek jawaban dari player dan enemy       
   if(playerSign == kertas && enemySign == batu){
           // TODO 5: Buat increment dari variabel playerScore
    playerScore++;
    Console.WriteLine("Anda Menang");
}
else if(playerSign == batu && enemySign == gunting){
            // TODO 5: Buat increment dari variabel playerScore
    playerScore++;
    Console.WriteLine("Anda Menang");
}
else if(playerSign == gunting && enemySign == kertas){
            // TODO 5: Buat increment dari variabel playerScore
    playerScore++;
    Console.WriteLine("Anda Menang");
}
else if(playerSign == enemySign){
    Console.WriteLine("Draw");
}
else{
            // TODO 5: Buat increment dari variabel enemyScore
    enemyScore++;
    Console.WriteLine("Anda Kalah");
}

}

public static void TranslatePlayerSign(){
        /* TODO 4: Buat logika pemrograman yang mengecek kondisi sbb.
        - Jika pilihan Player sama dengan 0, maka cetak pesan "Pilihan Anda adalah batu".
        - Jika pilihan Player sama dengan 1, maka cetak pesan "Pilihan Anda adalah kertas".
        - Jika pilihan Player sama dengan 2, maka cetak pesan "Pilihan Anda adalah gunting".
        - Jika pilihan tidak sama seperti kondisi di atas, cetak pesan "Pilihan Anda tidak sesuai".
        */
        if (playerSign == 0){
            Console.WriteLine("Pilihan Anda adalah batu");
        }
        else if(playerSign == 1){
            Console.WriteLine ("Pilihan Anda adalah kertas");
        }
        else if(playerSign == 2){
            Console.WriteLine ("Pilihan Anda adalah gunting");
        }
        else{
            Console.WriteLine ("Pilihan Anda tidak sesuai");
        }
    }
    
    public static void TranslateEnemySign(){
        /* TODO 4: Buat logika pemrograman yang mengecek kondisi sbb.
        - Jika pilihan enemy sama dengan 0, maka cetak pesan "Pilihan musuh adalah batu".
        - Jika pilihan enemy sama dengan 1, maka cetak pesan "Pilihan musuh adalah kertas".
        - Jika pilihan enemy sama dengan 2, maka cetak pesan "Pilihan musuh adalah gunting".
        - Jika pilihan tidak sama seperti kondisi di atas, cetak pesan "Pilihan musuh tidak sesuai".
        */
        if (enemySign == 0){
           Console.WriteLine("Pilihan musuh adalah batu");
       }
       else if(enemySign == 1){
           Console.WriteLine ("Pilihan musuh adalah kertas");
       }
       else if(enemySign == 2){
           Console.WriteLine ("Pilihan musuh adalah gunting");
       }
       else{
        Console.WriteLine ("Pilihan musuh tidak sesuai");
    }
}

public static void ShowScore(){
       // TODO 5: Cetak pesan yang menampilkan skor sementara dari player dan enemy
    Console.WriteLine("Skor sementara Player: " + playerScore + " vs" + " Enemy: " + enemyScore);
}

public static void CheckFinalScore(){
        /* TODO 6: Buat logika pemrograman yang mengecek kondisi sbb.
        - Jika skor dari player lebih besar dari enemy, maka cetak pesan Selamat Anda menang dan tampilkan skor.
        - Jika skor dari player sama dengan enemy, maka cetak pesan Draw dan tampilkan skor.
        - Jika dua kondisi di atas tidak terpenuhi maka mencetak tulisan Anda kalah dan tampilkan skor.
        */
        if(playerScore > enemyScore){
            Console.WriteLine("Selamat Anda Memenangkan Pertandingan!");
            Console.WriteLine("Hasil akhir Player: " + playerScore + " vs" + " Enemy: " + enemyScore);
        }
        else if(playerScore == enemyScore){
            Console.WriteLine("Draw nih");
            Console.WriteLine("Hasil akhir Player: " + playerScore + " vs" + " Enemy: " + enemyScore);
        }
        else{
            Console.WriteLine("Yah, Anda kalah. Coba lagi ya");
            Console.WriteLine("Skor akhir Player: " + playerScore + " vs" + " Enemy: " + enemyScore);
        }
    }
}