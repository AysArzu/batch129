package day21overloadingstatic;

public class C01_Overloading {
    public static void main(String[] args) {

    /*
     1)Method isimleri aynı olmalıdır.
     2)Method parametreleri farklı olmalıdır.
        i)Parametre sayıları değiştirilebilir.
        ii)Parametrelerin data tiplerini değiştirebilirsiniz.
        iii)Parametrelerin yerlerini değiştirebilirsiniz fakat ancak data tipleri farklı ise.
    3)Method ismi + Parametreler = Method Signature olusturur.
     imza sizi digerlerinden ayirir
     Method Signature dışında ne değiştirirseniz değiştirin
     Java o methodları farklı kabul etmez.
     Java secilmesi gereken methodu gostermek icin renklendirir
     */
// OVERLOADİNG YAPMA YONTEMLERİ
        //İ) Parametrelerin data type larını değiştirerek (toplama)
        //ii)parameterelerin sayısını değiştirerek overloading(cıkarma)
        //iii) data typle ların yerini değiştirerek overloading yapabiliriz (çarpma)
        toplama(3, 5);
        toplama(3.6, 5);
        toplama((float)3.6, 5);
        cikarma(40,10);
        cikarma(40,10,5);
        carpma(5,2.8);
        carpma(5.9,2



        );
    }

    private static void carpma(int a, double b) {
        System.out.println("int ile double carpma : "+ (a*b));
    }
    private static void carpma(double a, int b) {
        System.out.println("double ile int carpma : "+ (a*b));
    }

    //
    private static void cikarma(int a, int b) {
        System.out.println("iki int ile cıkarma "+ (a-b));
    }
    private static void cikarma(int a, int b,int c) {
        System.out.println("üç int ile cıkarma "+ (a-b-c));
    }

    private static void toplama(int a, int b) {

        System.out.println("iki int ile toplama "+( a+b));
    }
    private static void toplama(double a, int b) {

        System.out.println("bir double bir int ile toplama "+ (a+b));
    }
    private static void toplama(float a, int b) {

        System.out.println("float  ile int toplama "+ (a+b));
    }

}
