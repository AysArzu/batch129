package day24accessmodifiersinheritance;

public class Vehicle {
    /* Child Class'dan bir object oluşturduğunuzda Constructor'lar en üstteki
     class'dan başlatılarak alta doğru çalıştırılır*/

    public String type;

    public Vehicle(){

    }
    public Vehicle(String type){
        this.type=type;
        System.out.println("Vehicle Constructor");
    }
}
