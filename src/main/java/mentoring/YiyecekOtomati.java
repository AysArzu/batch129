package mentoring;

import java.util.Scanner;

public class YiyecekOtomati {
    public static void main(String[] args) {
        String[] urunler = {"Kraker", "Bisküvi", "Gofret", "Sakiz", "Cikolata", "Seker", "Bonibon", "Bonbon", "Cikolata", "Kek", "Su", "Soda", "Meyve Suyu", "Kola", "Gazoz"};
        int[] fiyatlar = {10, 15, 8, 3, 10, 13, 12, 8, 15, 7, 4, 7, 15, 20, 16};
        int bakiye = 0;
        System.out.println("******* Yiyecek Otomatı *******");
        System.out.println("No\tUrunler\t\t\t Fiyatlar");
        for (int i = 0; i < urunler.length; i++) {
            System.out.println((i + 1) + "-\t" + String.format("%-13s", urunler[i]) + " = \t" + String.format("%2d", fiyatlar[i]) + " Tl");
        }
        System.out.println("*".repeat(30));

        int secim;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ürün Numarasını Girin" + "\nÇıkmak Icin 0 tusuna basiniz");
            secim = input.nextInt();
            if (secim > 0 && secim < 16) {
                System.out.println(urunler[secim - 1] + " Sectiniz. Ucreti = " + fiyatlar[secim - 1] + " TL");
                if (bakiye < fiyatlar[secim - 1]) {
                    do {
                        System.out.println("Parayı Yerleştirin\n1 Tl 5 TL 10 TL 20 TL");
                        int para = input.nextInt();
                        switch (para) {
                            case 1:
                            case 5:
                            case 10:
                            case 20:
                                bakiye += para;
                                //  System.out.println( fiyatlar[secim-1]-bakiye+ " TL daha girmeniz lazım");
                                break;
                            default:
                                System.out.println("Geçersiz Para!");
                        }
                    } while (fiyatlar[secim - 1] > bakiye);
                }
                bakiye -= fiyatlar[secim - 1];
                System.out.println(urunler[secim - 1] + " aldınız.\nBakiyeniz = " + bakiye + " Tl");
            } else if (secim == 0) {
                System.out.println("Teşekkür Ederiz");
                if (bakiye > 0) {
                    System.out.println("Para Üstünü Alınız : " + bakiye + " TL");
                    break;
                } else {
                    break;
                }
            } else {
                System.out.println("Hatalı Ürün Seçimi!.. Lütfen Yeniden Giriniz");
            }
        } while (true);
    }
}
