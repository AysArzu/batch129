package aracKiralama;

import java.time.LocalDate;
import java.time.LocalTime;

public class AracAlmaVeTeslimEtme {
    private String alinacakSehir = "";
    private LocalDate alinacakGun;
    private LocalTime alisSaati;
    private String teslimEdilecekSehir = "";
    private LocalDate teslimGunu;
    private LocalTime teslimSaati;
    public void aracAlmaTarihi(){
        //burayi olustur
        System.out.println("Hangi tarihte arabayı teslim alacaginizi giriniz\n" +
                "tarihi gg/aa/yyyy seklinde giriniz");
        //   int alinacakgun=scan.nextInt();
    }
    public String getAlinacakSehir() {
        return alinacakSehir;
    }
    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }
    public LocalDate getAlinacakGun() {
        return alinacakGun;
    }
    public void setAlinacakGun(LocalDate alinacakGun) {
        this.alinacakGun = alinacakGun;
    }
    public LocalTime getAlisSaati() {
        return alisSaati;
    }
    public void setAlisSaati(LocalTime alisSaati) {
        this.alisSaati = alisSaati;
    }
    public String getTeslimEdilecekSehir() {
        return teslimEdilecekSehir;
    }
    public void setTeslimEdilecekSehir(String teslimEdilecekSehir) {
        this.teslimEdilecekSehir = teslimEdilecekSehir;
    }
    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }
    public void setTeslimGunu(LocalDate teslimGunu) {
        this.teslimGunu = teslimGunu;
    }
    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }
    public void setTeslimSaati(LocalTime teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
    public AracAlmaVeTeslimEtme() {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimEdilecekSehir = teslimEdilecekSehir;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }
}

