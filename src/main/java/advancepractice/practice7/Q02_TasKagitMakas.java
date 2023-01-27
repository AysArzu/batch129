package advancepractice.practice7;

import java.util.Scanner;

public class Q02_TasKagitMakas {
    /*Taş-Kağıt-Makas oyunu yazınız.
		-Oyuncudan tahmin alınız.
		-Bilgisayarın tahmini ile karşılaştırınız.
		-3'e ilk ulaşan kazanır
		-3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Platin Skor ile kazanır.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oyunucuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;
        int sayac = 0;

        while (oyunucuKazanmaSayisi < 3 && bilgisayarKazanmaSayisi < 3) {
            sayac++;

            System.out.println(sayac + ". Seçim: \nTas \nKagit \nMakas");
            String oyunucuTahmini = input.next().toLowerCase();

            if (!(oyunucuTahmini.equals("tas") || oyunucuTahmini.equals("kagit") || oyunucuTahmini.equals("makas"))) {
                System.out.println("Geçerli bir tahmin giriniz\n");
                sayac--;
                continue;
            }

            String[] arr = {"Tas", "Kagit", "Makas"};
            String bilgisayarTahmini = arr[(int) (Math.random() * 3)].toLowerCase();


            if (oyunucuTahmini.equals(bilgisayarTahmini)) {
                System.out.println("\nBerabere! Skor: " + oyunucuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);
            } else if (oyunucuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyunucuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") || oyunucuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                oyunucuKazanmaSayisi++;
                System.out.println("\nKazandınız! Skor: " + oyunucuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);
            } else {
                bilgisayarKazanmaSayisi++;
                System.out.println("\nBilgisayar Kazandı! Skor: " + oyunucuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);
            }
        }
        System.out.println("===GAME OVER===");
        String skor;
        if (oyunucuKazanmaSayisi == 3) {
            if (bilgisayarKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (bilgisayarKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız.");

        } else {
            if (oyunucuKazanmaSayisi == 0) {
                skor = "Altın";
            } else if (oyunucuKazanmaSayisi == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skor ile kazandı.");

        }
    }
}

