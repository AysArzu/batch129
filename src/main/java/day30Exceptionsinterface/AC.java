package day30Exceptionsinterface;

public interface AC {
    /*
  1)Bir interface'i bir Class'ın parent'i yapmak için "implements" keyword'unu kullanırız.
  2)Java parent'lar Class olduğunda "multiple parent"a müsaade etmez, ama biz bazen "Multiple Parent"a ihtiyaç duyarız.
  Bu ihtiyacı gidermek için Java "interface" ismini verdiği yeni bir yapı oluşturdu.
  Bu yapı sayesinde bir Class için çoklu "interface parent" oluşturabiliriz.

  Interface'ler concrete method içeremezler. Dolayısıyla interface'in içindeki hiçbirşey isteğe bağlı değildir,
  herşey child classlar için mecburidir. Bu yüzden interface'lere   "to-do list" de denir.
  3) çoklu interface parent'ların her birinin içine aynı isimli method'lar koyabiliriz.
  Mesela AC'nin, Engine'in ve Security'nin her birinin içlerine run methodu koymak gibi.
  Child Class herhangi birini override ettiğinde hepsini override etmiş gibi olur.
  Sonra da body'i child class'da yazarak  uygulamasını yapmış olur.

    Interfacelerin içerisine "concrete" method konulamaz.çünkü concrete methodlarda
    body vardır. Body o methodun işi nasıl yapacağını belirtir. Işin nasıl yapılacağı
    birçok detay içerir ve bu child classlarda kafa karışıklığına sebep olur. interfaceler fully abstract'tır.
    abstractlarda concrete method olduğu için fully abstract değildir
    interface'lerin constructor'u yoktur yani list<String> list1=new List<>(); diye birşey olamaz!!!List interfacedir.

    halbuki sadece yapılması gereken işi söyleyip nasıl yapılacağını child'a bıraksanız
    child class'ın kafa karışıklığını engellemiş olursunuz.

     Interfacelerdeki bütün methodlar abstract olduğu için yazmaya gerek yoktur
     Interface'lerdeki tüm methodlar otomatik olarak "publict"'ir, "abstract"'tır, ama  "statik"'değildir
    Interface class değildir. interface ,interface dir

    Interfacelerdeki variable'lar otomatik olarak "public"tir "statiktir" ve "final"dir.
    parentlerin içine aynı isimde variable koyabiliriz.
    Hepsinde price var ama biz interfaceden çağırırken interfaceAdı.price deriz
    AC.price=7000; final variableye değer atayıp değiştiremeyiz.
     Çünkü interfacelerdeki variablelerin değeri değiştirilemez.
      Interface ==> Birden fazla (multiple inheritence) parenta sahip olabilmek icin java tarafindan uretilen class type'idir.
     */
      void cool();
      void run();
      int price=2000;
      String model="Mitsubishi";
}
