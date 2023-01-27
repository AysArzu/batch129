package day28exceptions;

public class C04_Exceptions {
    /*
    4) NullPointerExceptions
     */
    // Bir String'te bulunan karakter sayısını veren kodu yazınız.

    public static void main(String[] args) {

       String str="Ebrar";//5
       getNumOfChars(str);
        String str2="";
       getNumOfChars(str2);//0
        String str3=null;
        getNumOfChars(str3);//NullPointerException
       //getNumOfChars(str);


    }

    private static void getNumOfChars(String str3) {
        try {
            System.out.println(str3.length());
        } catch (NullPointerException e) {
            System.err.println("length() methodunda hata oluştu");
            e.printStackTrace();
        }
    }


}
