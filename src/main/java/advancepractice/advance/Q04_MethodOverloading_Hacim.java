package advancepractice.advance;

public class Q04_MethodOverloading_Hacim {
    public static void main(String[] args) {

//Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)
//birbiriyle alakalı methodları bir yere koyduk
        Hacim obje = new Hacim();// her class bir data tipidir.
        int kupHacmi = obje.hacimHesapla(5);
        System.out.println("kupHacmi = " + kupHacmi);//125
        int karePrizmaHacmi = obje.hacimHesapla(5, 6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);//150
        int dikdortgenHacmi = obje.hacimHesapla(4, 5, 8);
        System.out.println("dikdortgenHacmi = " + dikdortgenHacmi);//160
int kupunHacmi2= obje.hacimHesapla(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);
    }
}
