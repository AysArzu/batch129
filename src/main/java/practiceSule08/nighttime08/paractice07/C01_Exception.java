package practiceSule08.nighttime08.paractice07;

public class C01_Exception {
    public static void main(String[] args) {


        double sonuc1 = karakterSayisiniKarsilastir("Tester", "Developer");
        System.out.println(sonuc1);
        double sonuc2 = karakterSayisiniKarsilastir("Tester", "");//Payda sıfır olamaz ==> / by zero
        System.out.println(sonuc2);
        double sonuc3 = karakterSayisiniKarsilastir(null, "Developer");
        System.out.println(sonuc3);
    }

    private static double karakterSayisiniKarsilastir(String str1, String str2) {
        double result = 0;
        try {
            result = str1.length() / str2.length();// length methodu int döndürür 5/9 =0 eder.
        } catch (ArithmeticException e) {
           // e.printStackTrace();
            System.err.println("Payda sıfır olamaz ==> " + e.getMessage());
        }
        catch (NullPointerException e){
            System.err.println("length() null ile hata verir.");
        } finally {
            System.out.println("DB ile bağlantı kesilsin...");
        }
        return result;

    }


}
