package mini_projects.Login2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();

    }

    public static void start() {
        Scanner inp = new Scanner(System.in);
        int select;
        do {
            showMenu();
            select = inp.nextInt();
            switch (select) {
                case 1:
                    //uye ol
                    break;
                case 2:
                    // giris
                    break;
                case 0:
                    System.out.println("iyi gunler");
                    break;
                default:
                    System.out.println("hatali giris tekrar deneyiniz");
            }
        }
        while (select != 0);

    }

    private static void showMenu() {
        System.out.println("Hosgeldiniz");
        System.out.println("1.uye ol");
        System.out.println("2.giris yap");
        System.out.println("0.cikis");
        System.out.println("seciminiz");
    }public static void login(){

    }
}