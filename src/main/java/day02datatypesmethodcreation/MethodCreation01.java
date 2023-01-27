package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
                Java'da method nasil olusturulur?
​
                1)main method'un disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}
​
                Olusturulan method'lar nasil kullanilir?
                1)main method'un icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
         */

    public static void main(String[] args) {

        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);

        System.out.println(kup);

    }

    public static int add(int a, int b){
        return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access Modifier'i default yapmak access modifier'i yazmayiniz
    static double getCube(double a){
        return a*a*a;
    }

}
