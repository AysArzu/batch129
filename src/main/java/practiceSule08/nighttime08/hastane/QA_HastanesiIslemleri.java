package practiceSule08.nighttime08.hastane;

import java.util.Scanner;

public class QA_HastanesiIslemleri {
    public static void start() {

        System.err.println("********BATCH 129 HOSPITAL********");
        System.out.println("Batch 129 Hastanesi'ne hoşgeldiniz.");
        System.out.println("Doktor seçimi için 1'e \nHastalığınıza göre işlem yapmak için 2'e" +
                "\nSistemden çıkmak için 3'e basınız");
        Scanner scan = new Scanner(System.in);
        int hastaSecimi;
        do {
            hastaSecimi = scan.nextInt();
            switch (hastaSecimi) {
                case 1:
                    //  doktorlar();
                    break;
                case 2:
                    // hastalik();
                    break;
                case 3:
                    System.out.println("Sağlıklı günler dileriz");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız. Lütfen doğru seçim yapınız");
            }
        } while (hastaSecimi != 3);


    }//method start
}

