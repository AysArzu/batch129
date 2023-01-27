package day25inhetirance;


public class Honda extends Car {

    public int price = 10000;

    public Honda() {

        System.out.println("Honda 1");
    }

    public Honda(String model, int year) {

        // super() yazmasakta aynı işi görür ama parametresiz olsun
        System.out.println("Honda 2: " + model + " - " + year);
    }

}

