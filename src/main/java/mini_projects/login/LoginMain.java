package mini_projects.login;

import java.util.Scanner;

public class LoginMain {


    /*Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.
             menü: kullanıcıya işlem seçimi için menü gösterilir.
             üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                                 kullanıcı adı, email ve şifre birer listede tutulur.
                                 aynı kullanıcı adı veya email kabul edilmez.
             giriş(login): kullanıcı adı/email ve şifre girilir.
                           kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                           kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.
             email validation: boşluk içermemeli
                             : @ içermeli
                             : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                             : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
             password validation: boşluk içermemeli
                                : en az 6 karakter olmalı
                                : en az bir tane küçük harf içermeli
                                : en az bir tane büyük harf içermeli
                                : en az bir tane rakam içermeli
                                : en az bir tane sembol içermeli*/
    public static void main(String[] args) {

        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();// bu obje ile diger classtaki methodlara ulasabilecegiz
        int select;
               //menuyu sectirme bolumu burasi
        do {
            userService.showMenu();//userservice deki methoda ulastik!!!
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 3:
                    System.out.println("Iyi gunler dileriz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz. Yeniden deneyiniz.");
            }

        } while (select != 3);
    }
}
