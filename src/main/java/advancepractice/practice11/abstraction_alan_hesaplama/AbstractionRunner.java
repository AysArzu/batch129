package advancepractice.practice11.abstraction_alan_hesaplama;

public class AbstractionRunner {
    /*Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)*/

    public static void main(String[] args) {

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(3, 7));
        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(3, 5));


    }


}

