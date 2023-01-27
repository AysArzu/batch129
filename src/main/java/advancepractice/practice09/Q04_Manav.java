package advancepractice.practice09;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*
     Basit bir 5 ürünlü manav alışveriş programı yazınız.

 * 1. Adim : Ürün ve fiyat listesi oluştur.
 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
 * 4. Adim : Alisveris bitince ödemesi gereken tutari göster.
 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
 *            istemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün sectir.
 *            Bu işlemi alışveriş bitene kadar tekrarla.

 */  static List<String> urunListesi = new ArrayList<>();
    static double toplamOdeme;


    public static void main(String[] args) {

        urunListesi.add("Domates - Ürün Kodu: 1 - Fiyatı: 20");
        urunListesi.add("Biber - Ürün Kodu: 2 - Fiyatı: 25");
        urunListesi.add("Patates - Ürün Kodu: 3 - Fiyatı: 9");
        urunListesi.add("Elma - Ürün Kodu: 4 - Fiyatı: 15");
        urunListesi.add("Muz - Ürün Kodu: 5 - Fiyatı: 30");

        System.out.println("urunListesi = " + urunListesi);
        musteriSecimi();

    }

    public static void musteriSecimi() {
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün kodunu giriniz");
        int kod = input.nextInt();

        System.out.println("İstediğiniz kiloyu giriniz");
        int kilo = input.nextInt();

        //toplamOdeme+=urunListesi.get(kod-1).split()
        toplamOdeme = toplamOdeme += Integer.parseInt(urunListesi.get(kod - 1).substring(urunListesi.get(kod - 1).lastIndexOf(" ") + 1)) * kilo;
        System.out.println(kilo + " kilo " + urunListesi.get(kod - 1).substring(0, urunListesi.get(kod - 1).indexOf(" ")) + ":" + toplamOdeme);
        System.out.println("(toplam Odeme "+ toplamOdeme);

        System.out.println("Devam etmek için D , kasa için herhangi bir karakter giriniz");
        String karar = input.next();
        if (karar.equalsIgnoreCase("d")) {
            musteriSecimi();
        } else {
            System.out.println("toplamOdeme = " + toplamOdeme);
            System.out.println("Güle güle yine bekleriz...");
        }


    }


}
