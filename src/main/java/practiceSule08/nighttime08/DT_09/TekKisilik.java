package practiceSule08.nighttime08.DT_09;

public class TekKisilik extends Otel{
    public static void main(String[] args) {


TekKisilik musteri1=new TekKisilik();
        System.out.println("musteri1 tv izleme ucreti"+musteri1.tv(5));
    }

    @Override
    public void kahvalti() {
        System.out.println("sadece sandwich");
    }


    public int tv(int saat){
    return saat*2;//saati 2 dolar
}}