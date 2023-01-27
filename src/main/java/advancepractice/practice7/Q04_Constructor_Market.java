package advancepractice.practice7;

public class Q04_Constructor_Market {
    public static void main(String[] args) {


        //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
        //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.
        //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
        //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.


            Market cikolata = new Market("Çikolata",20.50,6);
            System.out.println(cikolata);

            Market peynir = new Market("Peynir", 100,3);
            System.out.println(peynir);

            Market deterjan = new Market("Deterjan",200);
            System.out.println(deterjan);

            Market ekmek = new Market();
            System.out.println(ekmek);

}}