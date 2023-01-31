package practiceSule08.nighttime08.hastane;

public class Durum {

   private String actuelDurumu;
    private boolean acilMi;

    public String getActuelDurumu() {
        return actuelDurumu;
    }

    public void setActuelDurumu(String actuelDurumu) {
        this.actuelDurumu = actuelDurumu;
    }

    public boolean isAcilMi() {
        return acilMi;
    }

    public void setAcilMi(boolean acilMi) {
        this.acilMi = acilMi;
    }


    public Durum(String actuelDurumu, boolean acilMi) {
        this.actuelDurumu = actuelDurumu;
        this.acilMi = acilMi;
    }

    public Durum() {
    }
}
