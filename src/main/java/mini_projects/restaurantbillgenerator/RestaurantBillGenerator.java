package mini_projects.restaurantbillgenerator;

import java.util.Scanner;

/*

Proje: Restaurant Fis Uretme Uygulamasi(BillGenerator)
1-Bir restaurantin online siparis sisteminde hesabi
yazdiran uygulama tasarlayiniz.

2-Restauranttaki yiyecekler bir listede tutulsun.
Yiyeceklerin kodu, ismi ve ucreti olsun.

3-Yiyecek menusu, siparis olusturma/iptal ve hesap
 olusturma icin secim menusu gosterilsin

 4-Yiyecek menu:Listedeki yiyecekler menu seklinde listelensin
 Siparis girme:Yiyecegin kodu ve istenilen adet girilerek siparis olusturulsun
               Her siparis icin kod uretilsin(baslangic 1000 artarak devam eder)
               Her bir yiyecek siparisi icin tutar hesaplansin
  Siparis iptal:Siparis kodu girilerek siparis silinsin
  Hesap olusturma:Tutarlari ile birlikte tum siparisleri ve
                  toplam tutari gosteren bir hesap fisi yazdirilsin/

    ek:Sirket buyudu cafe kismi acildi.
      Ayni uygulama cafe kisminda da kulanilsin
      Cafe de farkli menu var.

 */
public class RestaurantBillGenerator {
    public static void main(String[] args) {
        start();

    }

    public static void start() {
        Scanner inp = new Scanner(System.in);
        OrderService orderService = new OrderService();
        System.out.println("Merhaba.alisveris yapmak istediginiz birimi giriniz");
        System.out.println("1-Restaurant");
        System.out.println("2-Cafe");
        int option = inp.nextInt();
        if (option == 1) {
            DishService dishService = new DishService();
            dishService.fillDishList();
            getSelectionMenu(dishService, orderService);
        } else {
            DishService dishService = new CafeDishService();
            dishService.fillDishList();
            getSelectionMenu(dishService, orderService);
        }


    }

    public static void getSelectionMenu(DishService dishService, OrderService orderService) {

        int select = -1;
        while (select != 0) {
            Scanner inp = new Scanner(System.in);

            System.out.println("----------------------------------");
            System.out.println("***  Lezzet Restaurant/Cafe Siparis Uygulamasi  ***");
            System.out.println("1-Menu");
            System.out.println("2-Siparis girme");
            System.out.println("3-Siparis iptal etme");
            System.out.println("4-Hesap olustur");
            System.out.println("0-CIKIS");
            select = inp.nextInt();
            System.out.println("----------------------------------");

            switch (select) {
                case 1:
                    //menuyu listele
                    dishService.showDishMenu();
                    break;
                case 2:
                    //siparis gir
                    orderService.createOrder(dishService);
                    break;
                case 3:
                    //siparis iptal et
                    orderService.deleteOrder();
                    break;
                case 4:
                    //hesap olustur
                    orderService.printBill();
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Hatali giris");
            }

        }
       slowPrint("Iyi gunler dileriz",45);

    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
