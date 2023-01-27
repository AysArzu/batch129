package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99 ==> Ondalik sayilar Java'da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "    ali cAN    ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);// A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); // C

        System.out.println("" + first + second);// AC

        //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz
        String str = "";

        //1.Yol: length() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);// true

        //2.Yol: isEmpty() kullan. Java bir konuda method uretmisse, o method'u kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? " + result2); //true

        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String t = "        ";

        //1.Yol:
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //2.Yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var? " + result4);

        //3.Yol:
        //isBlank() methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse false verir
        //isBlank() methodu bos String'ler icin de true verir.
        //isBlank() ==> space + hicbirsey icin true                isEmpty ==> hicbirsey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6: Bir String'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);// 1

        int idxI = r.indexOf('i');
        System.out.println(idxI);// 5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplami: " + (idxA+idxI+idxE));// Index'ler toplami: 14

        //Example 7: Bir String'de "Java" kelime'sinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyor Java." ==> 3
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin(Yani J nin) index'ini almis olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() method'u omayan character'ler icin kullanilirsa her zaman "-1" verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //Example 8: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);// 18


        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA + idxOfI + idxOfE);//40

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //           abbccdc ==> ad
        String y = "aac";

        char ch1 = y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you will learn Java.

        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin.
        int num = 12;

        if(num>0){
            System.out.println("Pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ekrana "Rakam" yazdirin
        int number = 30;

        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
        int n = 123;

        n = Math.abs(n);

        if(n>99 && n<1000){
            System.out.println("Wooow!");
        }
    }
}
