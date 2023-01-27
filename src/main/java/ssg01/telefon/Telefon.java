package ssg01.telefon;

public class Telefon {
    /*
telefon adli bir constructer olusturun ve
olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin
 */ String marka;
    String model;
    int fiyat;

    Telefon (String Ma, String Mo,int F){
        this.marka=Ma;
        this.model=Mo;
            this.fiyat=F;
    }

    public Telefon(String Ma, String Mo) {
        this.marka=Ma;
        this.marka=Ma;

    }

    public Telefon(String Ma) {
        this.marka=Ma;
    }
}
