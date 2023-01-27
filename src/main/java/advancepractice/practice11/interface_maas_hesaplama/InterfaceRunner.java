package advancepractice.practice11.interface_maas_hesaplama;

public class InterfaceRunner {
    public static void main(String[] args) {
        /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)

    Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar  artır.
                     Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
                     10 yıl ve üstü çalışma yılı bulunan çalışanların maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
         */

        MaasHesapla Ali = new MaasHesapla();
        System.out.println(Ali.netMaas(10000, 11, 160));
        MaasHesapla Ayse = new MaasHesapla();
        System.out.println("maasHesaplaAyse.netMaas(10000,15,180) = " + Ayse.netMaas(10000, 5, 180));

        MaasHesapla Veli = new MaasHesapla();
        System.out.println("Veli.netMaas(10000,1,180) = " + Veli.netMaas(10000, 1, 180));


    }
}
