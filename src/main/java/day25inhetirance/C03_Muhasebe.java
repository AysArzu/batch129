package day25inhetirance;
//super class
public class C03_Muhasebe extends C04_Personel {

    protected int saatUcreti;
    protected String statu;
    protected int saat=8;



    protected int maasHesapla(){
      int maas=  saatUcreti*saat*30;
        return maas;
    }


}
