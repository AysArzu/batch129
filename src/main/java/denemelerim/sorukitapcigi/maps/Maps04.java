package denemelerim.sorukitapcigi.maps;

import java.util.*;

public class Maps04 {
    /*
     Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
     bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

      Set<String >mySet=product.keySet();
      List<String > productName=new ArrayList<>(mySet);
      Collections.sort(productName);
        System.out.println(productName);

    }
}
