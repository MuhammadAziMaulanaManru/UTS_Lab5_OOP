package soal1;

public class Main {
    public static void main(String[] args) {
//ini adalah object
// Code di atas adalah contoh penggunaan kelas Kucing dan metode-metodenya.
// Cara kerjanya adalah membuat sebuah objek yang objek tersebut di inisialisasikan dengan menggunakan konstruktor kelas kucing yang menerima empat parameter
        Kucing meong = new Kucing("biru", "garong", "non-biner", "hijau");
        meong.Berlari();
        meong.Berlari(500);

//Code tersebut adalah contoh penggunaan kelas KucingSaya, yang merupakan turunan dari kelas Kucing
//Cara kerjanya adalah Objek ini diinisialisasi dengan menggunakan konstruktor kelas KucingSaya yang menerima lima parameter
        KucingSaya piwpiw = new KucingSaya("putih", "angora", "betina", "hitam", 20);
        piwpiw.Berlari();
        piwpiw.Tidur();
    }
}
