package mini_projects.biletrezervasyon;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2-plaka,koltuk numarasi
    public String numberPlate;
    public List<String> seats = new ArrayList<>();

    //3-otobus olusturuldugunda koltuk nolari da olsunve plaka set edilsin
    public Bus(String numberPlate) {
        this.numberPlate = numberPlate;
        for (int i = 1; i < 32; i++) {
            this.seats.add(i + "");// \String.valueOf() da kullanabiliriz.

        }
    }

}
