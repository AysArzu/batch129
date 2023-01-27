package ssg01.telefon;

public class Runner {
    public static void main(String[] args) {

        Telefon telefon1= new Telefon("Iphone","14",48000);
        System.out.println(telefon1.marka+","+ telefon1.model+","+telefon1.fiyat);
        Telefon telefon2=new Telefon("Casper", "note 10");
        System.out.println(telefon2.marka+","+telefon2.model+","+telefon2.fiyat);
        Telefon telefon3=new Telefon("Samsung");
        System.out.println(telefon3.model);
    }
}
