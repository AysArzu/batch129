package day22staticblocksconstractors;

public class Car {

    /*
    Constructor nedir?
    Class'tan object üretmemize yarayan kod block'larıdır.

    Class oluşturduğumuzda Java bize otomatik olarak bir Constructor verir.
    Ama bu constructor gözle görülmez, gözle görülmeyen otomatik olarak Java tarafından verilen bu constructor'lara
    "default constructor" denir.
           "default constructor"lar "Car(){ } " şeklindedir. isim class ismiyle aynı olur!!!
    Siz kendi constructor'ınızı oluşturuduğunuzda Java default constructor'u siler.
    Bir class'ta farklı parametreler kullanarak istediğiniz kadar contructor oluşturabilirsiniz
    Farklı constructor'lar sayesinde bir class'tan farklı farklı objeler oluşturabiliriz.
    Interview sorusu: Method ile Constructor'un farkı var mıdır? Varsa nedir?
     method ile constructor farklı yapılardır.
     1) methodlarda return type vardır, constructorlarda return type yoktur
     2) method ismi yaptığı işe göre developerlar tarafından belirlenir, Constructorların ismi ise her zaman class ismi ile aynı olmalıdır.


     */
//"class>Generate>tostring" hepsinin secilmesinden emin olarak oku tusla!!!


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }   Car(String make, String model){
            this.make=make;
            this.model=model;
            if(year==2023){
                this.year=0;

            }if(hybrid=true){
                this.hybrid=false;
        }
        }




}
