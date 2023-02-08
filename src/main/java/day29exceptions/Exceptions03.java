package day29exceptions;

import java.io.FileInputStream;//io ==> Input Output
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    1)FileNotFoundException ve IOException Compile Time Exceptions'lardır, yani kodu yazarken hata alırız.
    2)FileNotFoundException Path'in doğruluğu ve dosy anın varlığı ile ilgilidir.
      IOException tüm input ve output işlemleri ile ilgilidir.
    3)IOException Class, FileNotFoundException Class'ın parenti dir.
    4)istenirse FileNotException yerine IOException kullanılabilir.
    5)IOException Class ve FileNotFoundException beraber kullanılacaksa
    FileNotFoundException ustte IOException altta kullanılmalıdır.
 */
public class Exceptions03 {
    public static void main(String[] args)  {

//copy path/reference ye basıp sonra ==> Path From Concent root a tıkla linki kopyalarız
        try {
            FileInputStream fis= new FileInputStream("src/main/java/day29exceptions/File01.txt");

            int k=0;// default değer kullandığı için sıfır yazdık.
            while((k= fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file doesnT exist");
        } catch (IOException e) {
            e.printStackTrace();// hatanın açıklamasını yapar genelde devler kullanır.
        }
        System.out.println("\nHi");
    }
}
