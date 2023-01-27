package day03scanner;

import java.util.Scanner;

public class Scanner01 {
    //Kullanicidan data alip kodlarimizda kullanacagiz

    public static void main(String[] args) {

        //1.adim: Scanner Class'dan object olustur
        Scanner input = new Scanner(System.in);
        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");
        //3.adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        byte age = input.nextByte();
        System.out.println(age);


    }
}
