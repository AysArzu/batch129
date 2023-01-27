package day24accessmodifiersinheritance;

public class Ogrenci  {
    //name herkes tarafından bilinebilir  o yüzden public
    public String name="Tom Hanks";
    //student Id okul yönetimindeki insanlar tarafından bilinebilir, o yüzden default
    String stdId= "TH2023HU12001";
    //account number ben eşim ve çocuklarım tarafından bilinebilir, o yüzden protected
    protected int accountNum=7651234;
    // hesabımdaki para miktarı sadece benim tarafımdan bilinmelidir, bu yüzden private yaptım.
    private int balance=123000;
/*
    1)Access Modifier'lar genişten dara;public >protected > default > private
    2) Class'lar protected ve private olamazlar, sadece public ve default olabilir.
    Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler
    default(package private) da denir
    Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
Kac tane access modifier var ?
 4. public > protected > default > private

i)publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
ii)"protected" ayni packagein icinden ya da farkli package'larda o package'deki cocuklar ulasabilir.
iii)"default" sadece ayni package'den ulasilabilir. Bu yuzden defaultlarin diger adi" package private"'dir
iv) private sadece class iinden ulsaiılabilir. class dışına çıkıldığında ulaşılamaz
v) "protected" ile default"un farkı nedir?
Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.


Inheritance'in faydalari;
1) Code standardında tekrar iyi değildir.
2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
3) Gelişime update'e açık olmalıdır
4) Code atomic yapıda olmalı.
Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
Note 3:"public " methodlar child classlar tarafından kullanılabilir.
        "child classlar tarafından kullanılabilir" demek "inherit edilebilir" demektir.
Note 4: "protected" method'lar inderit edilebilir.
        Çünkü "protected" olan method ve variable'lar child'lar tarafından kullanılır.
Note 5: "default" methodlar onject ile aynı package'de oldukları sürece iherit edilebilirler.
        Ama default method ile object'in üretildiği class farklı package'lerde ise inherit edilemezler.
Note 6: "private" methodlar "inherit edilemezler".
Note 7: Java birden fazla parent'i (multiple inheritance Java tarafından desteklenmez) onaylamaz
Note 8: Child --> Parent --> Grand Parent--> GrandGrand Parent... şeklinde ilerleyen inheritance'lere "Multi Level Inheritance" denir.
Note 9: Java'da "Object Class" tüm Java Classlarının ortak parentidir
Note 10: Java da "Object Class" hariç tüm classların parenti vardır. javada parenti olmayan tek class "Object classtır."
Note 11: Java'da "parent"dan "child"a olan ilişkilere "HAS -A relationship" denir
        Java'da "child"dan "parent"a olan ilişkilere "HAS -A relationship" denir
Note 12: Javada her classın bir tane default constructor'u vardır.
Bu default Constructor class'ın içinde görünmez. Çünkü default constructor "Object Class'tadır.
Bizim class'ımız default constructora ihtiyac duyduğunda parent olan "Object Class"a gider ve oradaki constructor'ı kullanır.

 */



}
