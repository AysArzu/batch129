package ssg01.telefon;

import java.util.Scanner;

public class ForDongusuIleOgrenciKaydi {
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("kursa kayit yapma sistemine hos geldiniz.\nKac ogrenci kayit yaptiracaksiniz?");
    int numOfStd = scan.nextInt();
    String[] name = new String[numOfStd];
    String[] gender = new String[numOfStd];
    double[] weight = new double[numOfStd];
    double[] height = new double[numOfStd];

    for (int i = 0; i < numOfStd; i++) {
        scan.nextLine();
        System.out.println("ogrencinin adini giriniz");
        name[i] = scan.nextLine();
        System.out.println("Ogrencinin cinsiyetini giriniz (Erkek/Kadın)");
        gender[i] = scan.nextLine().toUpperCase().substring(0, 1);
        System.out.println("Ogrencinin kilosunu giriniz");
        weight[i] = scan.nextDouble();
        System.out.println("Ogrencinin boyunu giriniz");
        height[i] = scan.nextDouble();

        if (gender[i].equals("E") && height[i] >= 160 && weight[i] >= 70 && weight[i] <= 90) {
            System.out.println("Isim " + name[i] + " sisteme kaydolmustur");
        } else if (gender[i].equals("K") && height[i] >= 150 && weight[i] >= 50 && weight[i] <= 70) {
            System.out.println("Isim " + name[i] + " sisteme kaydolmustur");
        } else {
            System.out.println(name[i]+ " icin kayit islemi gerceklesemedi");
        }
    }

    if (numOfStd == 0) {
        System.out.println("Sisteme ogrenci kaydi yapilmadi");
    }
        }
}
