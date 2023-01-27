package day29exceptions;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptions {
    public static void main(String[] args) throws IOException {
      /*
      6) FileNotExceptions //dosya yolu yanlış ya da silinmiş olabilir
      7)IOException exceptionsların atası
      Javada bir dataya ulaşmak istediğimizde kullanırız.
      Bir obje oluştururuz. ceşitli methodları vardır.
      read() ==> Task'teki dataları okuyor ve getiriyor. okuyacak data kalmayınca -1 döndürüyor..
      skip() ==> Belirli bir kısmı atlayıp kalan dataları döndürür.
      available()==> Task'te kaç Bytelık data olduğunu size gösterir
      throw Bir exception fırlatmak için kullanılır.
      throws Bir veya birden fazla exception'ı bildirmek için metod signature'da kullanılır.
       */



            FileInputStream fis = new  FileInputStream ("src/main/java/day29exceptions/TaskExceptions");

            int i;

            try {
                while((i = fis.read()) != -1 ){
                    System.out.print((char)i);

                }
            } catch (FileNotFoundException e) {
                System.err.println("Dosya yolu yanlis ya da Dosya silinmis : "+e.getMessage());

            }catch (IOException e) {
                System.err.println("Dosya okurken problem olustu : "+e.getMessage());
            }
            System.out.println("Durmak Yok Yola devam");
        }
}
