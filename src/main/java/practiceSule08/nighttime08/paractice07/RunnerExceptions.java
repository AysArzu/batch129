package practiceSule08.nighttime08.paractice07;

import static practiceSule08.nighttime08.paractice07.MyExceptions.str;

public class RunnerExceptions {
    public static void main(String[] args) {
        MyExceptions my = new MyExceptions(str);
        try {
            int x = 100, y = 5;
            float ortalama = 0;

            ortalama = (float) x / (float) y;
            if (ortalama < 50) {
                throw new IllegalArgumentException("Ortalama çok düşük");//eğer açıklama yazmasaydık null derdi. burası getMessage bölümü
            }
        } catch (Exception e) {
            System.err.println("Sorunun kaynağı ne ==> "+e.getMessage());
        } finally {
            System.out.println(str);
        }


    }
}
