package day23datetimestringbuilder;

public class StringBuilder01 {
    /*
    Javada String String Class kullanılarak veya StringBuilder Class kullanılarak oluşturulabilir.
    "String Class" kullanılarak ürettiğimiz "Immutable" dir(değiştirilemez)
    "StringBuilder Class" kullanarak ürettiğimiz Stringler "Mutable"(değiştirilebilir)dir.
     */
    public static void main(String[] args) {
        //Immutable
String s="Java";
String t=s+"!";
String w="?";

        //Stringi ddeğiştirdikten sonra aynı String assign ederseniz, Java yine yeni bir container oluşturur
        // Değişmiş değeri bu yeni containerin içine koyar ve eski containeri gösteren oku yeni container'a yönlendirir
        //Dolayısıyla eski container adressiz kalır ve Garbage collector adressiz olan container ları siler.
        String a="Money";
        a=a+"More";

        // bunlar için java hep yeni yer oluşturur immutabledir

        //Mutable
        // StringBuilder kullanarak String üretmenin 1. yolu.
    StringBuilder sb1= new StringBuilder("Python")  ;
    sb1.append("!").append(4).append("&");// concat gibi ekleme yapıyor.istediğimiz kadar appendi yan yana koyabiliriz
        System.out.println(sb1);// Python!4&
        //Bunlar için java yeni yer oluşturmaz direk üzerine yazar

        //StringBuilder kullanarak String üretmenin 2. yolu.
        StringBuilder sb2=new StringBuilder();// java kurulunca kapasitesini 16 verir
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4

        //StringBuilder kullandığınızda başlangıç kapasite 16dır
        //Kapasite aşıldığında varolan kapasite nin iki fazlası kadar varolan kapasiteye ekleme yapar
        //16*2+2   -   34==34*2+2
        System.out.println(sb2.capacity());//16
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34==> 16*2+2 iki tane bons veriyor
        sb2.append("wwwwwwwwwwwwwwww");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70

        //StringBuilder kullanarak String üretmenin 3. yolu.
        StringBuilder sb3= new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3.length());//3 ikiydi var olan kadar ekledi 2 bonus verdi 2+2+2
        System.out.println(sb3.capacity());//6

        sb3.insert(2,"xxxxxx");// arasına sokmak demek
        System.out.println(sb3);//Flxxxxxxo

        //toString() StringBuilder ı String'e çevirir.
        //String classta var olan StringBuilder da olmayan split() gibi methodlara ihtiyaç udyduğumuzda
        // toString() methodu kullanarak String Class a geçer ve o methodları kullanırız.
        sb3.toString().split("l");// StringBuilderde split yok Stringe çevirerek o
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF
        sb3=new StringBuilder(sb3);//bunu yine stringBuilder a çevirdik!!!!!!

        //deleteCharAt(1) index 1 deki charakteri siler.
        sb3.deleteCharAt(1);// index 1 deki karakteri sil.
        System.out.println(sb3);//oxxxxxlF

        // delete(1,6) index 1 deki karakterden index5(6 dahil olmadığı için 5 yazdık)deki
        //karaktere kadar tüm karakterleri siler
        sb3.delete(1,6);
        System.out.println(sb3);//olF

        StringBuilder sb5= new StringBuilder("Kava");
        StringBuilder sb6= new StringBuilder("Java");

        System.out.println(sb5.compareTo(sb6));//-1 eğer ikisi aynıysa 0 verir harf sırasına göre aradaki farkı yazar.
        // eğer öndeyse ascii tableye göre değer çıkartması yapar. Baş harfleri farklı ve 2 harf farklıysa sadece baştakine bakar

       //setCharAt(2,'m') methodu belirli indexteki karakteri değiştiririz. char dikkat et!!!
        sb6.setCharAt(2,'m');
        System.out.println(sb6);//Jama

        sb6.replace(1,3,"xyz");
        System.out.println(sb6);//Jxyza

        //StringBuilder ClassDa kullanmamıza izin verilen substring() method gibi bazı String Class methodlarıvardır.
        // bu methodları StringBuilder ustunde kullanınca StringBuilder in orijinal değeri değişmez
       String sb7= sb6.substring(1,3);// atamazsan değişikliik yapamaz orjinal değer aynı kalır
        System.out.println(sb7);//xy sadece atayıp yazdırırsak görebiliriz
        System.out.println(sb6);//Jxyza

    }
}
