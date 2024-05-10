package soal1;

//berfungsi untuk mendefinisikan kelas 'kucing' dengan 4 variable yaitu WarnaBulu, JenisKucing, JenisKelamin dan WarnaMata.
//ini merupakan class "Kucing"
//Cara kerjanya adalah dengan menambahkan sifat kucing yang bertipe string dan akan di panggil di konstruktor
class Kucing {
    private String WarnaBulu;
    private String JenisKucing;
    private String JenisKelamin;
    private String WarnaMata;


//code berikkut adalah konstruktor untuk kelas kucing yang diunakan untuk menginisialisasi kelas objek
//ini adalah Constructor
//cara kerjanya adalah memasukkan data yang ada di parameter ke atribut class
    public Kucing (String WarnaBulu, String JenisKucing, String JenisKelamin, String WarnaMata){
        this.WarnaBulu = WarnaBulu;
        this.JenisKucing = JenisKucing;
        this.JenisKelamin = JenisKelamin;
        this.WarnaMata = WarnaMata;
    }

//digunakan untuk mengatur nilai properti-properti objek Kucing dari luar kelas
//contoh cara kerjanya Metode ini menerima satu parameter, yaitu WarnaBulu, yang merupakan nilai baru untuk properti WarnaBulu dari objek Kucing
    public void setWarnaBulu(String WarnaBulu){
        this.WarnaBulu = WarnaBulu;
    }public void setJenisKucing(String JenisKucing){
        this.JenisKucing = JenisKucing;
    }public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }public void setWarnaMata(String WarnaMata){
        this.WarnaMata = WarnaMata;
    }

//    untuk mengambil nilai properti-properti dari objek kelas Kucing.
//    Setiap metode ini tidak mengambil parameter dan mengembalikan nilai dari properti yang sesuai
//    cara kerjanya sebagai contoh adalah getWarnaBulu(): Metode ini tidak menerima parameter dan mengembalikan nilai properti WarnaBulu dari objek Kucing.
//    Dengan menggunakan return this.WarnaBulu, metode ini mengembalikan nilai dari properti WarnaBulu dari objek Kucing yang sedang diproses.
    public String getWarnaBulu(){
        return this.WarnaBulu;
    } public String getJenisKucing(){
        return this.JenisKucing;
    } public String getJenisKelamin(){
        return this.JenisKelamin;
    } public String getWarnaMata(){
        return this.WarnaMata;
    }


//mendefinisikan sebuah kelas Kucing yang memiliki beberapa metode untuk menggambarkan perilaku kucing.
//fungsinya adalah Metode ini mencetak pesan yang menunjukkan bahwa kucing sedang makan ikan asin. Ini adalah metode sederhana yang hanya mencetak pesan ke konsol.
//cara kerjanya adalah hanya dengan mencetak pesan ke konsol yang menggambarkan perilaku kucing dalam situasi yang berbeda.
    public void Makan(){
        System.out.println("lalu si kucing memakan ikan asin");
    }
    public void Tidur(){
        System.out.println("Setelah makan dia tertidur lelap");
    }

    //ini adalah Method Overloading
//Jadi, kelas Kucing memiliki dua versi dari metode Berlari().
// Saat metode Berlari() dipanggil, Java akan menentukan versi mana yang akan dieksekusi berdasarkan apakah argumen disediakan saat pemanggilan.
    public void Berlari(){
        System.out.println("kucing sedang berlari mengejar ikan asin");
    }
    public void Berlari(Integer Jarak){
        System.out.println("kucing sedang berlari mengejar ikan asin sejauh " + Jarak + "m");
    }
}


// class KucingSaya merupakan turunan dari kelas kucing yang di tambahkan dengan "Umur"
//mendefinisikan kelas KucingSaya yang merupakan turunan dari kelas Kucing. Dalam kelas KucingSaya, terdapat beberapa properti tambahan dibandingkan dengan kelas Kucing, yaitu Umur, yang merupakan umur kucing.
class KucingSaya extends Kucing {
    private String WarnaBulu;
    private String JenisKucing;
    private String JenisKelamin;
    private String WarnaMata;
    private Integer Umur;

//    ini adalah konstruktor untuk class "KucingSaya" yang di gunakan untuk menginisialisasi class object
//    public KucingSaya (String WarnaBulu, String JenisKucing, String JenisKelamin, String WarnaMata, Integer Umur): Ini adalah deklarasi konstruktor untuk kelas KucingSaya.
//    Konstruktor ini menerima lima parameter: WarnaBulu, JenisKucing, JenisKelamin, WarnaMata, dan Umur.
    public KucingSaya (String WarnaBulu, String JenisKucing, String JenisKelamin, String WarnaMata, Integer Umur) {
        super(WarnaBulu,JenisKucing, JenisKelamin, WarnaMata);
        this.Umur = Umur;
    }

//ini adalah Method getter
//fungsinya adalah untuk mendapatkan isi variable Umur
//cara kerjanya adalah mengembalikan nilai variable umur
    public Integer getUmur() {
        return Umur;
    }

//    ini adalah Method setter
//    fungsinya untuk mengatur nilai variable umur
//    cara kerjanya adalah dengan menerima satu parameter yaitu umur
    public void setUmur(Integer Umur) {
        this.Umur = Umur;
    }

//    ini adalah Method Overriding
//    Code di atas menunjukkan penggunaan anotasi @Override pada metode Tidur() dalam kelas KucingSaya
//    cara kerjanya adalah mengoverride (menimpa) metode dengan nama yang sama dari kelas induknya yaitu class kucing
    @Override
    public void Tidur(){
        System.out.println("Setelah makan dia tertidur dengan mata terbuka");
    }
}
