package kendicalismam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCalismasi {
    /*
      1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
      2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin
   saveInfo() method olusturun:
      3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
      4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
      5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
    getInfo() method olusturun:
      1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
      2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
    removeInfo() method olusturun:
      1)Kimlik numarasini girerek data silin.
      2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
      3)Collection bos ise kullaniciya hata mesaji verin.
   selectOption() method olusturun:
      1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */
   static Scanner scan= new Scanner(System.in);
   static   Map<String, String> kimlik= new HashMap<>();
    public static void main(String[] args) {
        Map<String, String> kimlik= new HashMap<>();

        System.out.println("Lutfen 4 haneli kimlik numaranizi giriniz");
        String kisi1= scan.next();


        selectOption();

   }

    private static void selectOption() {
        System.out.println("Yapmak istediginiz islemi giriniz." +
                "\nKullanici eklemek icin 1" +
                "\nKullanici bilgisi almak icin 2" +
                "\nKullanici silmek icin 3" +
                "\nIslemi sonlandirmak icin 0 a basiniz");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3:
                removeInfo();
                break;
            case 0:
                System.out.println("Isleminiz sonlanmistir");
                        break;
            default:
                System.out.println("yanlis secim yaptiniz. Lutfen tekrar deneyiniz");
                selectOption();
        }

    }public static void saveInfo(){
        System.out.println("Lutfen kaydetmek istediginin kisinin 4 haneli kimlik numaranizi giriniz");
        String kisi1= scan.next();
        scan.next();

        if(kimlik.containsKey(kisi1)){
            System.out.println("Sistemimizde bu kisi mevcuttur. Lutfen yeniden deneyiniz.");
            saveInfo();
        }else {
            System.out.println("Lutfen tam adinizi giriniz");
            String tamAd= scan.nextLine();
            System.out.println("Lutfen adresinizi giriniz");
            String adres= scan.nextLine();
            System.out.println("Lutfen telefon numaranisi giriniz");
            String telNo= scan.next();

            String values=tamAd+ " "+ adres+" "+ telNo;
            kimlik.put(kisi1,values);
            System.out.println("Verdiginiz bilgilere gore kisi sisteme eklendi."+ kimlik);
            selectOption();
        }









    }public static void removeInfo(){
        System.out.println("Silinecek kisinin TC numarasini giriniz.");
        String  tc= scan.next();
        if(kimlik.containsKey(tc)){
            kimlik.remove(tc);
            System.out.println("Silmek istediginiz "+ kimlik+ " basarili sekilde silinmistir.");
        }else {
            System.out.println("Lutfen gecerli tc giriniz");
            removeInfo();
        }selectOption();



    }public static void getInfo(){
        System.out.println("Bilgisini almak istediginiz kisinin TC kimlik numarasini giriniz.");
        String tcNo=scan.next();
        if(kimlik.containsKey(tcNo)){
            System.out.println(kimlik.get(tcNo));
        }else{
            System.out.println("Gecerli kimlik numarasi giriniz");
            getInfo();
        }selectOption();

    }
}
