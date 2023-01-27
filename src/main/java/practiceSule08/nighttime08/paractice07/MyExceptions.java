package practiceSule08.nighttime08.paractice07;

public class MyExceptions extends Exceptions {

    static final String str="Sen değerlisin";

    public MyExceptions() {
        super(str);
    }

    public MyExceptions(String str){
        super(str);
        System.out.println("Oyun oynadı");
    }

}
