package soal2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean areAnagram(String kata1, String kata2) {
        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        char[] charArray1 = kata1.toCharArray();
        char[] charArray2 = kata2.toCharArray();


        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata1, kata2;
        String choice;

        do {
            System.out.print("Masukkan kata pertama: ");
            kata1 = input.nextLine();

            System.out.print("Masukkan kata kedua: ");
            kata2 = input.nextLine();

            System.out.println("Anagram Status:" + areAnagram(kata1, kata2));

            System.out.print("Apakah Anda ingin melanjutkan? [Iya/Tidak]: ");
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("Iya"));
    }
}
