package practiceSule08.nighttime08;

public class KumandaRunner {
    public static void main(String[] args) {

        Kumanda tv = new Kumanda(11.5, 7, 9.8);

        tv.gucDugmesi();//true
        System.out.println(tv.kanalDegistirme("B"));//B
        System.out.println(tv.sesArtirma());//11
        System.out.println(tv.sesAzaltma());//10
    }
}
