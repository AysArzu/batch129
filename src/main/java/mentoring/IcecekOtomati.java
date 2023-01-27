package mentoring;

import java.util.Scanner;

public class IcecekOtomati {
    public static void main(String[] args) {
        String[] drinks = {"Ayran", "Fanta", "Sprite", "Cola", "Water", "IceTea",
                           "Lemonade", "Soda", "Salgam", "SevenUp", "Visne Suyu", "Seftali Suyu", "Kayisi Suyu",
                           "MultiVitamin", "Nar Suyu"};
        int[] cost = {8, 15, 15, 15, 5, 10, 12, 8, 15, 15, 9, 9, 9, 10, 16};
        System.out.println("********İÇECEK OTOMATI********");
        System.out.println("No\tÜrünler\t\t\t\tÜcreti");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + "-\t" + String.format("%-13s", drinks[i]) + " = \t" + String.format("%2d", cost[i]) + " Tl");
        }
        System.out.println("*".repeat(30));
        int balance = 0;
        boolean exit=false;
            do {
                System.out.println("Almak istediğiniz ürünün numarasını yazınız" + "\nOtomatımız sadece 5- 10 ve 20 TL kabul etmektedir.");
                System.out.println("çıkmak istediğinizde \"0\" a basınız");

                Scanner scan = new Scanner(System.in);
                int urunNo = scan.nextInt();
                if (urunNo > 0 && urunNo < 16) {
                    System.out.println(drinks[urunNo - 1] + " seçtiniz, ücreti " + (cost[urunNo - 1]) + " TL");
                    if (balance < cost[urunNo - 1]) {
                        do {
                            System.out.println("Lütfen para girişini yapınız");
                            int para = scan.nextInt();
                            switch (para) {
                                case 1:
                                case 5:
                                case 10:
                                case 20:
                                    balance += para;

                                    break;
                                default:
                                    System.out.println("Lütfen geçerli para giriniz");
                            }
                        } while (cost[urunNo - 1] > balance);
                    }
                    balance -= cost[urunNo - 1];
                    System.out.println(drinks[urunNo - 1] + " aldınız.\nPara üstünüz " + balance + " TL dir.");
                } else if (urunNo == 0) {
                    exit=true;
                    System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");

                    if (balance > 0) {
                        System.out.println("Para üstünü alınız: " + balance + " TL");
                        break;
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Hatalı ürün seçimi yaptınız. Lütfen bir daha deneyiniz ");
                }
            } while (!exit);

    }
}
