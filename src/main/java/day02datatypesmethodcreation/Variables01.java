package day02datatypesmethodcreation;

public class Variables01 {
    //primitive data types --> char - boolean - byte - short - int - long - float - double
    //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
    //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)

        //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
        //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        //Note 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplarlar
        //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Note: Java "Decimal Numbers" i otomatik olarak "double" kabul eder.
        //      Siz data type'ini "float" yazarsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //      float memory'de 4 byte yer kaplar, double 8 byte yer kaplar
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        //System.out.print() ekrana yazdirir ve "pointer" i ayni satirda tutar
        System.out.println(shirtPrice + shoesPrice);

        //System.out.println() yazdirmanin kisa yolu ==> "sout" yaz ve Enter'a bas
        System.out.println();

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip);//8.9E-14 ==> 0.000000000000089 ==> "8.9 carpi 10 uzeri -14"  "E ==> Exponent"
    }
}
