package day24accessmodifiersinheritance;

public class Student {
    /*
   Access Modifier
   1)public     2)protected
   3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)
   yazarsan kizar
   4)private

   Note: Access Modifier'lari genisden dara dogru sayiniz
         public > protected > default > private
   Note: Access Modifier'lari birer birer aciklayiniz
         public olanlar her class'dan kullanilabilir
         protected olanlar baska package'lerden kullanilamaz
         ancak baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
         private olanlar sadece olsturulduklari Class icinde kullanilabilirler
   Note: "protected" ile "default" un farkini soyleyiniz.
         protected olanlar baska package'lerden kullanilamaz ancak
         baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
   Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
         public, default kullanilir ama protected ve private kullanilamaz
*/

    //public her classtan kullanılabilir.
    public String stdName = "Ebubekir Can";

    //protected olanlar sadece child classlardan görülür.
    protected String stdAdress = "Istanbul";

    //default
     String mail="@gmail.com";

     //private oluşturulduğu classta görülür
    private String tcNo= "12345678910";
}
