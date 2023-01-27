package day20passbyvalueoverloading;

public class C02_PassByValue {

     /*

        Gomlek            = 100 TL
        Ogrenci           = -10 TL indirim =90 TL
        Gazi              = -20 TL indirim =80 TL
        Yaslilara         = -5  tL indirim =95 TL

       */

    public static void main(String[] args) {
        int gomlek = 100;

        System.out.println(indirim("ogrenci", gomlek));//90
        System.out.println(indirim("Gazi", gomlek));//80
        System.out.println(indirim("Yaslilar", gomlek));//95

        String kutlama = "Woow";
        System.out.println("kutlama = " + kutlama);
        kutlamaUnlemiIle(kutlama);
        System.out.println("ünlem eklendikten sonra kutlama = " + kutlama);// ünlem eklenmedi atanmadığı için
        kutlama = kutlamaUnlemiIle(kutlama);
        System.out.println("methoddan sonra main içinde kutlama = " + kutlama);
    }//main

    private static String kutlamaUnlemiIle(String kutlama) {

        String unlemliKUtlama = kutlama + "!";
        System.out.println("method içinde unlemliKutlama = " + unlemliKUtlama);
        return unlemliKUtlama;
    }

    private static int indirim(String durum, int gomlek) {
        switch (durum) {
            case "ogrenci":
                gomlek = gomlek - 10;
                break;
            case "Gazi":
                gomlek = gomlek - 20;
                break;
            case "Yaslilar":
                gomlek = gomlek - 5;
            default:
                gomlek = gomlek;
        }
        return gomlek;

    }
}//class