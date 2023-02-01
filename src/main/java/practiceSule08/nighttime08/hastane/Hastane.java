package practiceSule08.nighttime08.hastane;

public class Hastane extends VeriBankasi{

    private Doktor doktor; //doktor classindan olusturduk string te bir class doktor  da bir class onu da o sekille kullanabiliiyoruz
    private Hasta hasta;  //hasta classindan olusturduk

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }

    public Hastane() {
    }

    public Hastane(Doktor doktor, Hasta hasta) {
        this.doktor = doktor;
        this.hasta = hasta;
    }

    @Override
    public String toString() {
        return "Hastane{" +
                "doktor=" + doktor +
                ", hasta=" + hasta +
                '}';
    }
}
