package day19listsvarargs;

public class Varargs01 {
    /*
    Varargslar method oluştururken parametre sayısında bize esneklik verir.
    Method'un parantezleri içine yazılanlara "parametre" denir
    Method'u çağırırken kullanılan sayılara "argument" denir.

    Note: Bir methodda birdenfazla varargs parametre kullanılamaz. Çünkü ikincisi "Unreachable Code" olur.

     */
    public static void main(String[] args) {
        addTwoNumbers(3, 5);
        addThreeNumbers(3, 6, 9);
       add(4,7,2,9);
    }
    // iki sayıyı toplayan method oluşturunuz
    public static void addTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }//Üç sayıyı toplayan method oluşturunuz

    public static void addThreeNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }// Istediğiniz kadar sayıyı toplayan bir method oluşturunuz
    public static void add(int... a){
        int sum=0;
        for (int w:a) {
            sum+=w;
        }
        System.out.println("Varargs toplamı : "+sum);
    }
}
