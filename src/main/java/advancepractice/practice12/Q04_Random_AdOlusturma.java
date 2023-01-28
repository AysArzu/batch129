package advancepractice.practice12;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {

        String alfabe = "abcçdefgğhıijklmnoöpqrsştuüvwxyzABCÇDEFGĞHIİJKLMNOÖPQRSŞTUÜVWXYZ ";
       int rastgeleIdx=((int) (Math.random() * alfabe.length()));

        String isim = "Ayşe Battal";
        String yeniIsim="";


        for (int i = 0; i < isim.length(); i++) {
            int sayac=0;
            while(true){
                char rastgeleHarf= alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if(isim.charAt(i)==rastgeleHarf){
                    yeniIsim+=rastgeleHarf;
                    System.out.println(yeniIsim+sayac);
                    System.out.println(sayac);
                    break;
                }
            }

        }


    }



}
