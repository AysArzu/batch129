package Lambdapractice;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {

        System.out.println(birdenXeKadarToplam(10));//55
        System.out.println(tekSayilarinToplami(15));//64
        System.out.println(sonsuzaKadarOlanTekSayilarinToplami(12));//144
        System.out.println(ikidenSonsuzaCiftSayilarinToplami(4));//20
        System.out.println(BestenSonsuzaGidenKuvvetlerininToplami(4));//780
        System.out.println(faktoryel(5));


    }//SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.

    public static Integer birdenXeKadarToplam(int x) {
        Integer sonuc = IntStream.range(1, x + 1).sum();//rangeClosed tavsiye edilir
        return sonuc;
    }

    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static Integer tekSayilarinToplami(int x) {
        Integer sonuc = IntStream.rangeClosed(1, x).filter(t -> t % 2 != 0).sum();
        return sonuc;
    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static Integer sonsuzaKadarOlanTekSayilarinToplami(int x){
       int sonuc= IntStream.iterate(1,t->t+2).limit(x).sum();
       return sonuc;//istedigimiz degerden baslar istedigimiz artis oraninda sonsuza kadar gider
    }
    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidenSonsuzaCiftSayilarinToplami(int x){
       int sonuc= IntStream.iterate(2,t->t+2).limit(x).sum();
       return sonuc;
    }
    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int BestenSonsuzaGidenKuvvetlerininToplami(int x){
        int sum=IntStream.iterate(5,t->t*5).limit(x).sum();
        return sum;
    }
//x satisinin faktoryelini bulunuz
    public static int faktoryel(int x){
       int sonuc= IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
return sonuc;
    }
}
