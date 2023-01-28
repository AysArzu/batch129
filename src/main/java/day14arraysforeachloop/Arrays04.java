package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {


        //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w : colors) {
            if (w.equals("Yellow")) {
                break;
            }
            System.out.println(w);
        }

        //Example 2: String bir array olusturnuz, 6 eleman ekleyiniz, "Yellow" dan sonraki elemanlari yazdiriniz
        String color[] = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        //1.Yol:
        //Note: Elemanlari almaya son elemandan baslayacagim icin for-each loop kulanamam, bu yuzden for-loop kullandim.
        for (int i = color.length - 1; i >= 0; i--) {
            if (color[i].equals("Yellow")) {
                break;
            }
            System.out.println(color[i]);
        }

        //2.Yol:
        //Yellow elemaninin index'ini bul ve o index'den daha buyuk index'e sahip olan elemanlari yazdir.
        int counter = 0;
        //Red, Orange, Blue, Yellow, Green, Brown
        for (String w : color) {
            if (w.equals("Yellow")) {
                break;
            }
            counter++;
        }

        for (int i = counter + 1; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }
}
