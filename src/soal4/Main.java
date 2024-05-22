package soal4;

public class Main {
    public static void main(String[] args) {

        // Contoh penggunaan
        MeltingIce ice1 = new MeltingIce(2); // Massa 2 kg, kalor lebur default
        System.out.println("Energi yang diperlukan untuk melelehkan 2 kg es: " + ice1.calculateEnergy() + " Joule");

        MeltingIce ice2 = new MeltingIce(3, 340000); // Massa 3 kg, kalor lebur 340000 J/kg
        System.out.println("Energi yang diperlukan untuk melelehkan 3 kg es dengan kalor lebur 340000 J/kg: " + ice2.calculateEnergy() + " Joule");

        // Menggunakan method overloading
        System.out.println("Energi yang diperlukan untuk melelehkan 4 kg es: " + ice1.calculateEnergy(4) + " Joule");
        System.out.println("Energi yang diperlukan untuk melelehkan 5 kg es dengan kalor lebur 350000 J/kg: " + ice1.calculateEnergy(5, 350000) + " Joule");
    }

}

