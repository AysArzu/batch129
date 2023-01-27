package day25inhetirance;

public class C01_Memur extends C03_Muhasebe {
    @Override
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", saat=" + saat +
                ", \nisim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {


        C01_Memur memur1 = new C01_Memur();

        //personel classtan aldık.
        memur1.isim = "Osman";
        memur1.soyIsim = "Sagir";
        memur1.adres = "Izmir";
        memur1.telNo = "543344333";
        memur1.personelNo = 1001;
        memur1.saat = 8;
        memur1.saatUcreti = 20;


        memur1.statu="Memur";
        memur1.maasHesapla();
        System.out.println(memur1);





    }
}
