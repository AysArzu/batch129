package advancepractice.practice09.overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.15;
    }
}
