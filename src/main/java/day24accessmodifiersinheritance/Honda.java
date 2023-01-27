package day24accessmodifiersinheritance;

public class Honda extends Car{

    public String renk="Beyaz";

    public Honda(){
        super("White",50000);
        //super deyince kendi classı değil
        // baba clasındaki bilgi kullanılıyor.
    }public Honda (String renk){
        this.renk=renk;

    }
}
