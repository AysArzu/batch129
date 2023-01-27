package day18List;

import java.util.List;
import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {
/*Example:Integer bir List oluşturun
          List'e 5 tane eleman ekleyiniz
          Bu elemanlardan 12'yi siliniz
 */
        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);
        //NOTE: Java'ya tam sayı yazdığımızda, Java o tamsayının data type'ını otomatik olarak "primitive int" kabul eder.
        //      Bu yüzden remove() methodu'nun içine yazdığınız tamsayı eleman olarak değil index olarak kabul edilir.
        //      Tamsayıyı eleman olarak gostermenin birkaç yolu vardır.

        //1.YOL:
        //  Integer nonPrimitive=12;// küçük int kabul etmiyor hala index zannediyor!!!
        // ages.remove(nonPrimitive);

        //2.YOL:
        ages.remove((Integer) 12);
        System.out.println(ages);//[10, 25, 8, 40]

        //3.YOL:
        ages.remove(Integer.valueOf(12));

        //4.YOL:
        //ages.remove(ages.indexOf(12));


/*Example:Integer bir List oluşturun
          List'e 5 tane eleman ekleyiniz
          Tüm 12'leri siliniz
 */
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);

        //removeAll() methodu List ile çalışır
        //removeAll() methodu bir veya birden fazla elemanın tüm görünümlerini silmek için kullanılır.
        nums.removeAll(silinecekler);
        System.out.println(nums);//[10, 25, 8]
    }
}
