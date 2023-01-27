package day30Exceptionsinterface;

public class Exceptions01 {
    public static void main(String[] args) {
        /*
            1)Exceptions olsa da olmasa da çalıştırmamız gereken kod'ları "finally block" içerisine yazarız.
            2)DB ile bağlantıyı kesme işini yapan kodlar gibi kod'lar her halukarda çalıştırılmalıdır, bu tarz kodları
             finally block içine koyarız.
            3)"try block" yalnız kullanılamaz.
               "try block" + 1 "catch block" mümkündür
               "try block" + 1 "catch block"+ 1 "finally clock" mümkündür
               "try block" + çoklu "catch block" mümkündür
               "try block" + çoklu "catch block" + 1 finally block mümkündür
               "try block" + 1 "finally block" mümkündür
             4)Çoklu "finally block" kullanılamaz.
         */
        int a = 12;
        int b = 2;
        int[] c = {3, 6, 9, 12};
        m(c, a, b);

    }

    public static void m(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB");
        }

    }
}
