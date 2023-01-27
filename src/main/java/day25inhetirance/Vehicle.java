package day25inhetirance;

public class Vehicle {
    /* 1) Child Class'dan bir object oluşturduğunuzda Constructor'lar en üstteki
     class'dan başlatılarak alta doğru çalıştırılır

     2) Child Class'daki construvtordan Parent Class'daki constructor'a gidebilmek için "super() " kullanılır
     3) Parent Class'da birden fazla constructor varsa istenilen constructor, super() ifadesinin parantezi içine yazılan
     parametreler yardımı ile secilebilir.
     4) Aynı Class içindeki constructor'ları seçmek için "this()" kullanılır
     Aynı Class Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
  parametreler yardimi ile secilebilir.

     5)"super()" ifadesini yazmak istepe bağlıdır, yazmasakta Java sanki "super()" varmış gibi davranır.
     Ama kodunuzu kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
     6) "super()" ve "this()"  ifadesi constructor içinde her zaman ilk satırda olmalıdır.
    7) Bir constructor içinde "super()" ve "this()"  ifadeleri sadece bir kere kullanılabilir. Bakınız 6. kural...
    8)Inheritance 'da variableleri ve methodları çağırmak için "this" veya "super" kullanılır
    "this" aynı class içindeki variableleri ve methodları çağırmak için kullanılır.
    "super" parent class içindeki variableleri ve methodları çağırmak için kullanılır.
    9)Inheritance'de object kullanarak variable çağırırsanız objenin data type 'ını temsil eden class'dan
    variable'ı aramaya başlayınız. O class'da yoksa parent'lara bakınız.
    10)Inheritance'de object kullanarak method çağırırsanız objenin constructor'ını temsil eden class'dan method'u aramaya başlayınız
    O class'da yoksa parent'lara bakınız.

    OOP Principals:
    i)Inheritance
    ii)Polimorphism : Method Overloading+ Method Overriding
    iii)Encapsulation
    iv)Abstraction
 */
//method çağırırken constructora bakıcaz ====== variable çağırırken data type'ına bakıcaz

    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine...");
    }

    public Vehicle() {
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {

        System.out.println("Vehicle 2:" + price);
    }
}
//super() parenttaki constructor u çalıştırmaya yarar