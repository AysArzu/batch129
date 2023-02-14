package mini_projects.loginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5-User objesi ile ilgili islemler
public class UserService {
    //6-Kullanici bilgilerini tutmak icin list olusturalim
    List<User> userList = new ArrayList<>();
    //tum methodlarda kullanicidan bilgi almak icin Scanner objesini olusturduk
    Scanner inp = new Scanner(System.in);

    //7-Username veya email bilgisi ile kayitli useri getirmek icin bir method olusturalim
    private User getUser(String userNameOrEmail) {
        for (User user : userList) {
            if (user.getUserName().equals(userNameOrEmail)) {
                return user;
            } else if (user.getEmail().equals(userNameOrEmail)) {
                return user;
            }
        }
        return null;
    }

    public static boolean validateEmail(String email) {
        boolean isValid;
        boolean isExistsSpace = email.contains(" ");
        boolean isContainsAt = email.contains("@");


        if (isExistsSpace) {
            System.out.println("Email bosluk iceremez");
            isValid = false;
        } else if (!isContainsAt) {
            System.out.println("Email @ sembolunu icermelidir");
            isValid = false;
        } else {//asd@gmail.com
            String firstPart = email.split("@")[0];//asd@gmail->["asd", "gmail.com"
            String secondPart = email.split("@")[1];//gmail.com
            boolean valid = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").isEmpty();

            boolean checkStart = valid && firstPart.length() > 0;

            boolean checkEnd = secondPart.equals("gmail.com") || secondPart.equals("hotmail.com") || secondPart.equals("yahoo.com");
            if (!checkStart) {
                System.out.println("Mailin kullanici adi bolumu en az bir karakter icermelidir " +
                        "ve sadece kucuk buyuk harf rakam ya da -._ icerebilir");
            }
            if (!checkStart) {
                System.out.println("email gmail.com, hotmail.com veya yahoo.com ile bitmelidir! ");
            }
            isValid = checkStart && checkEnd;

        }
        if (!isValid) {
            System.out.println("Tekrar deneyiniz.");
        }
        return isValid;
    }//9-password validation

    private static boolean validatePassword(String password) {
        boolean isValid;
        boolean isExistSpace = password.contains(" ");
        boolean isLengthGreaterThanSix = password.length() >= 6;
        boolean isExistUpperLetter = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean isExistLowerLetter = password.replaceAll("[a-z]", "").length() > 0;
        boolean isExistDigit = password.replaceAll("[\\D]", "").length() > 0;
        boolean isExistSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;
        if (isExistSpace) {
            System.out.println("Sifre bosluk iceremez ");
        } else if (!isLengthGreaterThanSix) {
            System.out.println("Sifre en az alti karakter icermelidir");

        } else if (!isExistUpperLetter) {
            System.out.println("Sifre en az bir buyuk harf icermelidir");

        } else if (!isExistLowerLetter) {
            System.out.println("Sifre en az bir kucuk harf icermelidir");
        } else if (!isExistDigit) {
            System.out.println("Sifre en az bir rakam icermelidir");

        } else if (!isExistSymbol) {
            System.out.println("sifre en az bir sembol icermelidir");
        }
        isValid = !isExistSpace && isExistUpperLetter && isExistDigit && isExistSymbol && isExistLowerLetter&&isLengthGreaterThanSix;
        if(!isValid){
            System.out.println("Gecersiz sifre, tekrar deneyiniz.");
        }
        return isValid;
    }
public void register(){
    System.out.println("Ad-Soyad giriniz");
    String name=inp.nextLine();
    //10-username unique olmali
    String username=getUserName();
}
//10-a) kullanicidan username almak
    private String getUserName(){
        String userName;
        boolean existUsername;
        do {
        System.out.println("Kullanici adinizi giriniz");
        userName=inp.next();
        existUsername=getUser(userName)!=null;
        if(existUsername){
            System.out.println("Bu username kullanilmistir, farkli bir username deneyiniz.");

        }


    }while (existUsername);
        return userName;
    }

}
