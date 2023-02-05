package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class lambda1s {
    public static void main(String[] args) {

        List<Integer> mylist = new ArrayList<>();
        mylist.add(12);
        mylist.add(8);
        mylist.add(23);
        mylist.add(10);
        mylist.add(7);
        System.out.println(getSumOfAllElements(mylist));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getmultiplyFromThreeToNine1());
        System.out.println(getmultiplyFromThreeToNine2());
        System.out.println(getFaktorial(7));
        System.out.println(getSumOfEvensBetweenTwoInt(5,14));
        System.out.println(getSumOfDigitsBetweentwoInts(12,18));


    }//Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.

    public static int getSumOfAllElements(List<Integer> mylist) {
        return mylist.stream().reduce(Math::addExact).get();//listte get kullaniyoruz
    }//tek reduce kullanirsan optional int yaparsin get yazarsan optionalint olmaz

    //7'den 70 'e kadar olan tum sayilarin toplamini yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();//intstream de getasint oluyor

    }//3'ten 9'a kadar tum tam sayilarin carpimini veren methodu yaziniz

    public static int getmultiplyFromThreeToNine1() {//181440
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();//rangeClosed() iki rakam dahil icindekilerle islem yap
    }//range olsa 3 dahil 9 haric demek

    public static int getmultiplyFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();//181440
    }
//size verilen sayinin faktoryelini hesaplayiniz
    public static int getFaktorial(int x){
        if(x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;// return her halukarda yazmaliyiz cunku return type int
        }else
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }//rangeClosed de ikinci sayi 1. sayidan kucuk olamaz

    //5)Size verilen 2 tam sayi arasindaki tum cift sayilarin toplamini veren sayiyi yaziniz

    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
      return   IntStream.range(a=1,b).filter(Utils::isNumberEven).sum();


    }//size verilen 2 tam sayi arasindaki tum tamsayiarin rakamlari toplamini veren kodu yaziniz
    public static int getSumOfDigitsBetweentwoInts(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
    }// rakamlari teker teker alip sonradan toplayacak streamdeki elemanlar degisecek bu yuzden reduce yerine map kullandik.
}