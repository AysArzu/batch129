package advancepractice.practice12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.) eksi olursa exception attirdik
    public static void main(String[] args) {
try {
    System.out.println(faktoriyel(5));
}catch (Exception e){
    System.out.println( "Islem gerceklesmedi catch calisti");
}



    }public static int faktoriyel(int sayi) {
        if (sayi >= 0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi - 1);
            }


        } else throw new ArithmeticException("Sayi sifirdan kucuk olamaz!");


    }
}
