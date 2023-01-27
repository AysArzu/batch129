package day30Exceptionsinterface;

public class Accord implements AC,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }

}
