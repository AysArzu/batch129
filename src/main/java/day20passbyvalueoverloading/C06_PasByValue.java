package day20passbyvalueoverloading;

public class C06_PasByValue {
    public static void main(String[] args) {
        // 100TL ye satılan bir ürün için 2 farklı indirim uygulayan iki method oluşturun

        int fiyat=100;
        indirimYap25(fiyat);
        System.out.println("Atamadan yazdırılan fiyat = " + fiyat);//100
        System.out.println("main içinde methoddan sonra fiyat  ="+fiyat);//100

        fiyat= indirimYap10(fiyat);
        System.out.println(fiyat);// atayıp yazdırdık ondan değer 90 olur!! Atamadan yazdırsaydık eski değeri verir!!!

        // sout(indirimYap(fiyat)) diye yazınca indirimi direk veriyor 90 olur

    }

    private static int indirimYap10(int fiyat) {
        fiyat*=0.90;
        return fiyat;
    }

    private static void indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 indirimli fiyat ="+ fiyat);
    }
}
