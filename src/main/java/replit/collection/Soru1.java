package replit.collection;

public class Soru1 {
    /*Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları:  siyah,sari,mavi,turuncu

Beklenen Çıktı:

siyah

sari
`
mavi
`
turuncu
*/
    public static void main(String[] args) {
        String arr[]={ "siyah","sari","mavi","turuncu"};
        for (int i=0; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }

}
