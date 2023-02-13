package practicenighttime08;

public class Kumanda {
    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;

    private int maxVolume = 32;
    private int ses = 10;
    private boolean guc;//false


    public Kumanda(double genislik, double yukseklik, double ekranBuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }//cons

    public String kanalDegistirme(String kanal) {

        switch (kanal) {
            case "A":
                return kanal;
            case "B":
                return kanal;
            case "C":
                return kanal;
        }


        return kanal;
    }

    public void gucDugmesi() {

        this.guc = !guc;
        System.out.println(guc);
    }

    public int sesAzaltma() {
        if (ses > 0) {
            ses--;
        }
        return ses;
    }

    public int sesArtirma() {
        if (ses < maxVolume) {
            ses++;
        }
        return ses;
    }


}
