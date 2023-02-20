package mini_projects;

import java.util.Scanner;

public class OgrenciSecimi {
    /*
Proje: Spor kursu için seçilecek öğrencileri belirleyen
       bir uygulama yazınız.

       kurs gereklilikleri:
            erkekler: boy: 1.60 ve üstü
                      kilo:70-90 kg
            kızlar: boy: 1.50 ve üstü
                    kilo:50-70 kg

       kullanıcıdan öğrenci sayısı ve herbir öğrenci
       için isim , cinsiyet, kilo ve boy bilgilerini girmesini
       isteyiniz.
 */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sistemimize hosgeldiniz. lutfen asagidaki formu doldurunuz.");
        System.out.println("Ogrenci sayisini giriniz: ");
        int numOfStudent = inp.nextInt();
        String[] students = new String[numOfStudent];
        String[] gender = new String[numOfStudent];
        double[] weight = new double[numOfStudent];
        double[] height = new double[numOfStudent];
        boolean isSuccess = true;//cinsiyetini kontrol etmek icin yaptik. dogruysa devam ettik yanlissa basa yolladik
        do {
            //surekli tekrarlayacagi icin do-while icine her seferinde kayit yapacagi icin  for loop'a koyduk


            isSuccess = true;
            for (int i = 0; i < numOfStudent; i++) {
                inp.nextLine();
                System.out.println("Kayit olacak ogrencinin ismini giriniz");
                students[i] = inp.nextLine();

                System.out.println("Ogrencinin cinsiyetini giriniz");
                String gen = inp.next().toUpperCase().substring(0, 1);

                if (gen.equalsIgnoreCase("K") || gen.equalsIgnoreCase("E")) {
                    gender[i] = gen;
                } else {
                    System.out.println("Hatali giris");
                    isSuccess = false;
                    break;
                }
                System.out.println("Ogrencinin boyunu giriniz");
                height[i] = inp.nextDouble();

                System.out.println("Ogrencinin kilosunu giriniz");
                weight[i] = inp.nextDouble();
            }

        } while (!isSuccess);//false iken devam edecek
        ///kisi listeyi doldurdu. simdi kimler kayit olabilir ona bakacagiz!!!
        int counter = 0;
        System.out.println("Kursa secilen ogrenciler: ");
        for (int i = 0; i < numOfStudent; i++) {
            if (gender[i].equals("K") && height[i] >= 150 && weight[i] >= 50 && weight[i] <= 70) {
                System.out.println("Isim: " + students[i] + " Cinsiyet: " + gender[i] + " boy: " + height[i] +
                        " Kilo: " + weight[i] + ". Sisteme kaydi basari ile tamamlanmistir");
                counter++;
            } else if (gender[i].equals("E") && height[i] >= 160 && weight[i] >= 70 && weight[i] <= 90) {
                System.out.println("Isim: " + students[i] + "  Cinsiyet: " + gender[i] + "  boy: " + height[i] +
                        "  Kilo: " + weight[i] + ". Sisteme kaydi basari ile tamamlanmistir");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("sisteme gerekli  kayit kosullarini hicbir ogrenci saglayamamistir");
        }
    }
}
