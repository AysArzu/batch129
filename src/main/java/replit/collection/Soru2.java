package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen java kodunu yazınız.
Array List:  siyah,mavi,kirmizi,beyaz
en başa: **pembe**
mavi-kirmizi arasına **yesil**  renk eklenecek.

Beklenen Çıktı:[pembe,siyah,mavi,yesil,kirmizi,beyaz]*/

        List<String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("beyaz");
        list.add(0, "pembe");
        list.add(2,"yesil");
        System.out.println(list);
    }
}
