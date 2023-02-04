package replit.conditionalstatement;

public class Soru08 {
    /*
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
     */
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1;j<i;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
