package day30Exceptionsinterface;

public class InvalidNumberException extends RuntimeException{


    public InvalidNumberException(String message){

        super(message);


//Urettigimiz exception'i compile time exception olmasini istiyorsak parent'i exception yap.
//Urettigimiz exception'i run time exception olmasini istiyorsak parent'i "RunTimeException" yap
        //InvalidNumberException geçersiz numara exception demek

    }
}
