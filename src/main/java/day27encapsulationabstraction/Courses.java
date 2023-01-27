package day27encapsulationabstraction;

public  abstract class Courses {

public abstract void math();

/* 1)Bazen method body'sini yazmak gerekmez. Bu durumlarda body'siz method oluşturmak gerekir.
     Body'si olmayan methodlara "abstract method'lar" denir.

   2)Absract Methodlar Child classlar tarafından override edilmek zorundadırlar.
     Bu yüzden eğer bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz o methodu
     abstract yapmak gerekir.

   3)Bir methodun body'sini silmek o methodun abstract olması için yeterli değildir.
     "access modifier ile return type arasına abstract keyword koymak gerekir.

   4)"Abstract methodlar" sıradan classların(concrete) içine yazılamazlar ,
   "Abstract methodlar"ın içine yazıldıkları classlar da abstract olmak zorundadirlar

    5)"abstarct classlar"da hem "abstract methodlar" hem de "concrete method"lar kullanılabilir

    6) "concrete class"lar "abstract class"ların child'ı olabilirler
    "absract method"ların override edilme zorunluluğu "concrete class"lar içindir

 */

public void art(){

    System.out.println("Painting");
}    //"final method"'lar override edilemezler halbuki "abstract method"lar override edilmek için oluşturulurlar
     //Bu çelişkidir, bu yuzden Java abstract method"ların final olmasına müsaade etmez..
     //public final abstract sience();CTE verir
    //Concrete class"lar final olduğunda Child Class'a sahip olamazlar.
    //Ama "Abstract Class"lar için Child Class olmalıdır. Çünkü Child Class'lar abstract parent class'daki abstract methodları kullanırlar
    //Bu yüzden, Java " Abstract class"ların "final" olmasına müsaade etmez
//abstract methodlar kesinlikle override edilmeli. childda mutlaka olmalı soruda ne varsa o
// altında varmı diye düşünme!!!sadece parent classı verdiyse override edildi mi diye düşünme içinde override edilmese de olur
    //"Abstract method"lar private olamazlar,çünkü child class'lar abstract methodları kullanırlar.
    // private yapınca kullanıma kapalı olur bu çelişkidir, bu yüzden Java abstract methodların "private" olmasına müsaade etmez.
    //"abstract method"lar "static" olamazlar. Çünkü static method'lar override edilemezler. Halbuki abstract method'lar override edilmek için oluşturulmuştur.
    //"abstract class'ların içinde tamamlanmamış abstract methodlar vardır. abstract methodlar'ın body'si olmadığından bu methodlar yarım method sayılır
    // Dolayısıyla abstract classlar eksiği olan kalıplar gibi düşünülebilir.
    //Java eksik kalpların obje üretmesine müsaade etmez bu yüzden "abstract class"lardan object üretilemez.
    //"absract classs"ların constractorları vardır ama bu constructor object üretemez haldedir.


}
