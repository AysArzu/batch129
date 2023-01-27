package day22staticblocksconstractors;

public class StaticBlocks01 {
 static    double pi;
 static  String shape;
 static {
     pi=3.14;
     System.out.println("Static block1");

// Static block mainden önce çalıştı!!!!!!!!!!!!!!!!!
 }static {
     shape="Circle";
     System.out.println("Static block2");
    }
    public static void main(String[] args) {
        // Bir variable oluşturduğunuzda değer aramazsanız o variable i "initialize" etmediniz demektir.(değer ataması)
        // Static variablelar static blocklar içinde initialize edilirse o
        // classin içinde herşeyden önce hzır hale getirilmiş olur
        //Bazen main method çalıştırılmadan önce variableların hazır hale getirilmesi gerekir. bu yüzden static blocklar kullanırlır.
        // 2 Static method varsa önce enyukarıda olan çalışır
        // Main method yukarıda olsa da önce staticler çalışır
        //NOTE 1: Static blocklar static variabeleri initialize etmek için kullanılırlar.
        //NOTE 2: Static blocklar class içinde herşeyden önce çalıştırılırlar
        System.out.println("main method");

    }
}
