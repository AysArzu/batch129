package day16multidimansionalarray;

public class Md03 {
    public static void main(String[] args) {
        //Example: Bir tane multidimensional array oluşturunuz
        //Bu arraydeki tüm sayıların toplamını veren kodu yazınız.
        //Multidimensional arraylerde elemanlara tek tek ulaşmak için iç içe loop kullanılır
        int a[][ ]={{2,62,82},{3,13}};
        int sum=0;
        for (int [] w: a){
            for (int s:w) {
                sum+=s;
            }
        }
        System.out.println(sum);//162
    }
}
