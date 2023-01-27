package day30Exceptionsinterface;

public class HondaRunner {

    public static void main(String[] args) {

        Civic civic = new Civic();
        civic.cool();
        System.out.println(AC.price);//2000
        System.out.println(Engine.price);//3000
        System.out.println(Security.price);//4000

        System.out.println(AC.model);//Mitsubishi

      //  AC.price=7000; final variableye değer atayıp değiştiremeyiz.
      //  Çünkü interfacelerdeki variablelerin değeri değiştirilemez.

        Accord accord = new Accord();
        accord.cool();

    }
}
