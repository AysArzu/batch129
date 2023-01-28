package aracKiralama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MusteriveAracBilgileri {
    public static void main(String[] args) {

       aractalep();
    }
    /*
    Araba Kiralama Projesi TASK   ***********
            Bir araç kiralama projesi hazırlayınız.        Arac Talebi adında bir POJO class oluşturunuz.
             -  alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
             -  marka, model, yakitTipi, vites ve gunlukUcret (araç ile ilgili bilgiler).
            -   Kiralama ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
            -   Araç ile ilgili variable’ları içeren parametreli bir constructor oluşturun.,
            -   Tum variable’lar için Getter ve Setter method’ları oluşturun (Encapsulation).
            MusteriveAracBilgileri adında method’ları içeren bir class oluşturunuz.
            -   aracTalep() adında bir method oluşturunuz.        Bu method’da alinacak sehir, teslim edilecek sehir,
    alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.        Odenecek toplam gun sayisini yazdırın.
            o   Dikkat: Teslim gunu, alis gününden daha once olamaz.
            -   arabalar() create ederek, tüm araç modellerini bir list’e atınız.
     (parametre olarak araç ile bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
    Bu list’i göstererek bir aracı kiralamasını sağlayın.
            -   getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin. Onaylar ise, müşteri bilgilerini almak için devam edin.
            -   musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
            -   OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz. Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
    */
   static Scanner scan = new Scanner(System.in);
    public static void aractalep() {
        // Teslim aracYeri1= new Teslim();
        System.out.println("Lutfen araci alacaginiz sehri secerek giris yapiniz\n" +
                "Ankara, Istanbul, Adana, Izmir, Ardahan");
        String teslimAlinacakSehir = scan.nextLine().trim().toLowerCase();

        String[] sehirler = {"ankara", "istanbul", "adana", "izmir", "ardahan"};

        System.out.println("Lutfen araci teslim edeceginiz sehri secerek giris yapiniz\n" +
                "Ankara, Istanbul, Adana, Izmir, Ardahan");
         teslimAlinacakSehir = scan.nextLine().trim().toLowerCase();
        boolean gecerliSehirMi = Arrays.toString(sehirler).toLowerCase().contains(teslimAlinacakSehir);
        if (!gecerliSehirMi) {
            System.out.println("Lutfen listedeki sehirlerden birini seciniz!..");
            aractalep();
        }
        System.out.println("Teslim Edilecek Şehri Seçiniz: ");
        String teslimEdilecekSehir = scan.nextLine().trim().toLowerCase();
        boolean dogruSehirMi = Arrays.toString(sehirler).toLowerCase().contains(teslimEdilecekSehir);
        if (!dogruSehirMi) {
            System.out.println("Lutfen listedeki sehirlerden birini seciniz");
            aractalep();
    }
   // public void aracBilgisi() {
        List<Araba> arabaList = new ArrayList<>();
        List<Araba> rezerveList = new ArrayList<>();
        Araba araba1 = new Araba("Toyota", "Corolla", "Benzin", "Duzvites", 500);
        Araba araba2 = new Araba("Honda", "Civic", "Dizel", "Otomatik", 700);
        Araba araba3 = new Araba("Mitsubishi", "Colt", "LPG", "Duzvites", 400);
        Araba araba4 = new Araba("Fiat", "Albea", "Dizel", "Otomatik", 750);
        Araba araba5 = new Araba("Toyota", "Corona", "Hybrid", "Otomatik", 750);
        arabaList.add(araba1);
        arabaList.add(araba2);
        arabaList.add(araba3);
        arabaList.add(araba4);
        arabaList.add(araba5);
        System.out.println(arabaList);
        System.out.println("Lutfen yukaridaki araclardan birisini seciniz\n" +
                "Toyota Corolla icin 1\n" +
                "Honda icin 2\n" +
                "Mitsubishi icin 3\n" +
                "Fiat icin 4\n" +
                "Toyata Corona icin 5\n" +
                "i tuslayiniz");
        int aracSecim = scan.nextInt();
        Araba secilenAraba = arabaList.get(aracSecim - 1);
        System.out.println("Sectiginiz arac : " + arabaList.get(aracSecim - 1));
        rezerveList.add(arabaList.get(aracSecim - 1));
        arabaList.remove(aracSecim - 1);
        System.out.println("sahsin rezerve ettigi araba " + secilenAraba);
    }
    void musteriBilgileri() {
        String adSoyad;
        String id;
        String telefon;
        String yas;
        Scanner inp = new Scanner(System.in);
        System.out.println("Adınız Soyadınız:");
        adSoyad = inp.nextLine();
        System.out.println("TC no:");
        String tcNo = inp.next();
        System.out.println("Yaşınız:");
        yas = inp.next();
        inp.nextLine();
        System.out.println("Telefon Numaranız:");
        String tel = inp.nextLine();
        System.out.println("Ad-Soyad: " + adSoyad + "\nTC no: " + tcNo + "\nYaş: " + yas + "\nTelefon: " + tel);
    }
}
