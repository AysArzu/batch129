package day30Exceptionsinterface;

/*
 */
public class Civic implements AC,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs perfectly");
    }
}
