package practiceSule08.nighttime08.paractice07;

public class C02_Exceptions {
    public static void main(String[] args) {
/*
rastgeleSayi isminde bir method oluşturunuz.
Bu method içerisinde iki int random sayı oluşturunuz.(0 dan 10 a kadar)
Bu ikirandom sayının topşamını yazdırınız.
Eğer bu iki random sayının  toplamı 12 den küçükse "Exception" versin ve mesaj olrak
("Sayı 12'den küçük ise hata verir") yazdırın.
 */
        rastgeleSayi();

        System.out.println("Haziranda işe girmiş olacaksın insallah");//Çalıştı!!!



    }

    private static void rastgeleSayi() {
         int sayi1=(int)(Math.random()*10);
         int sayi2=(int)(Math.random()*10);
        System.out.println(sayi1+"=="+sayi2);

        int toplam= 0;
        try {
            toplam = sayi1+sayi2;
            System.out.println(toplam);
            if(toplam<12){
                throw new Exception();// içine istediğin yazıyı yazabilisin.
            }

        } catch (Exception e) {
            System.out.println("Toplam 12'den büyük olsun "+ e.getMessage());
        } finally {
            System.out.println("DB ile bağlantı kesildi.");
        }

    }
}
