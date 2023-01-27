package practiceSule08.nighttime08.DT_09;

public class KralDairesi extends Otel {
    public static void main(String[] args) {
        KralDairesi musteri3=new KralDairesi();
        System.out.println(musteri3.tv("international", 7)+"$");
        musteri3.kahvalti();
        System.out.println("musteri 3 wifi ucreti : "+ musteri3.wifi(8)+"$");
    }
    @Override
    public void kahvalti() {
        System.out.println("Kahvalti yataga gelir");
    }public int tv(String interational, int saat){
        if(interational.equals(("international"))){
            return saat*100;
        }else return 0;
    }
}
