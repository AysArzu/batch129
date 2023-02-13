package mini_projects.repeatAracSigortaApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi   :Haziran 2022              2.dönem :Aralik 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü gösterilsin.
 */
    public static void main(String[] args) {

start();

    }public static void start(){

        Scanner inp=new Scanner(System.in);
        //hatali girite veya yeni islem icin menu tekrar gosterilsin

        do{
            System.out.println("---Zorunlu Sigorta Pirimi Hesaplama----");
            System.out.println("Tarifew donemini seciniz");
            System.out.println("1.Haziran 2022");
            System.out.println("1.Aralik 2022");
            //exception handle etme
            int term =0;
            try {

                term= inp.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Gecersiz giris yaptiniz, lutfen sayi giriniz.");
            }
            inp.nextLine();//hafizaya girdigi bilgiyi bosa cikarttik




        }while(true);

    }
}
