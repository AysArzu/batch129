package day25inhetirance;

public class C02_Isci extends C03_Muhasebe {

    public String isciStatu = "Surekli Isci";


    protected String mesai () {
        System.out.println("Isciler her cagrildiklarinda haftada" +
                " 5 gun calisir");
        String str="Fazla mesai";
        return str;
    }//method
    public static void main(String[] args) {
        C02_Isci isci1 = new C02_Isci();
        isci1.isim = "Ebubekir";
        isci1.soyIsim = "Can";
        isci1.adres = "Istanbul";
        isci1.telNo = "761247124";
        isci1.personelNo = 2000;



        isci1.saat = 7;
        isci1.saatUcreti = 30;
        isci1.isciStatu="Dev";

        System.out.println(isci1);
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
                "saatUcreti=" + saatUcreti +
                ", isciStatu='" + isciStatu + '\'' +
                ", calismaSaati=" +saat +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", mesai ='" + mesai() + '\'' +
                '}';
    }
}
