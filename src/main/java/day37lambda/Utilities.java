package day37lambda;

public class Utilities {

    public static void yazInt(int n){
        System.out.print(n+" ");
    }
    public static void yazString(String s){
        System.out.print(s+" ");
    }
    public static boolean tekMi(int n){
       return n%2!=0;
    }
    public static boolean ciftMi(int n){
        return n%2==0;
    }
    public static boolean pozitifMi(int n){
        return n>0;
    }
    public static boolean negatifMi(int n){
        return n<0;
    }
    public static int karesiniBul(int n){
        return n*n;
    }
    public static int kupunuBul(int n){
        return n*n*n;
    }
    public static int toplam(int a,int b){
        return a+b;
    }public static int carpim(int a,int b){
        return a*b;
    }public static boolean uceBolunebilme(int n){
        return n%3==0;
    }
}
