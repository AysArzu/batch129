package day20passbyvalueoverloading;

public class C01_PassByValue {
    public static void main(String[] args) {
       /*
        Pas By Value : Method'  a valuenin bir kopyasını gönder demektir.
       Bu nedenle Pas By Value da orjinal parametre değişmez.
       Java Pass By Value kullanır.
       1) Java variable nin orjinal değerini korumak ister.
       2)Java variablenin içindeki değeri kopyaşar ve methodun içerisine kopya değeri gönderir
      Deger üzerinde yapılan değişiklikler orjinal parametreyi etkilemez.
      
      Pass By REferance'da ise referans kopyalanır ve methodda kullanılır.
       yapılan değişiklik orjinal parametreyi etkiler
     Bu tarz programlar değeri korumak istiyorsa işi developer'a bırakmıştır. 
      Kendisi değeri değiştirir. 
       

        */
        int gomlek=100;
        // indirimli fiyat değişmez atama olmadığı için
        System.out.println("gomlek = " + gomlek);//100

      gomlek=  ogrenciIndirimi(gomlek);
        System.out.println("atamada sonra maindeki gomlek = " + gomlek);
    }

    private static int ogrenciIndirimi(int gomlek) {
      int ogrenciGomlegi=  gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//90
        return ogrenciGomlegi;
    }
}
