package advancepractice.practice08;

import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {

    public static void main(String[] args) {
/*
     Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
     Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
     Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
     Örn: A-->Z, B-->Y ...
     "abcdefghijklmnopqrstuvwxyz";
     "zyxwvutsrqponmlkjihgfedcba";
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = input.nextLine().toLowerCase();
        String alfabe = "abcdefghijklmnopqrstuvwxyz";


        for (int i = 0; i < metin.length(); i++) {//kelime indeksi
            for (int j = 0; j < alfabe.length(); j++) {// alfabe indeksi
                if (metin.charAt(i) == alfabe.charAt(j)) {
                    System.out.print(alfabe.charAt(alfabe.length()-1-j));
                }
            }
        }

//2.Yol
        System.out.println("\n===2. Yol===");
        for (int i=0; i<metin.length();i++){
           int idx='z'-metin.charAt(i);
            System.out.print((char) ('a'+idx));
        }
    }
}
