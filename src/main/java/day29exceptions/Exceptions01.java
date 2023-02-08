package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        //Birbirine dönüştürülemeyecek data type'larini dönüştürmekte ısrar ederseniz Java "ClassCastException" atar
        Object obj=70;
        String str= "";//ClassCastException==> Run Time Exception
        try {
            str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.out.println("Her data type'i her data type'ına çevrilemez");
        }

    }
}
