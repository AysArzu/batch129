package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exception {
    public static void main(String[] args) throws IOException {

//available()==> kullanılabilir byte sayısını bize verir

         FileInputStream fis= null;
        try {
            fis = new FileInputStream("src/main/java/day29exceptions/TaskExceptions");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(" kullanılabilir byte sayısını bize verir : "+ fis.available());
        // kullanılabilir byte sayısını bize verir : 5920
        // dosyadan 3 byte lık data okudu.
        fis.read();
        fis.read();
        fis.read();
        System.out.println(" kullanılabilir byte sayısı : "+ fis.available());// kullanılabilir byte sayısı : 5917
    }
}
