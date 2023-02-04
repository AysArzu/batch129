package replit.conditionalstatement;

public class Soru10PaskalUcgeni {
    public static void main(String[] args) {
/*

      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1 
 */
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5-i ; j++) {
                System.out.print(" ");
            } int no=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(no+" ");
                no=no*(i-j)/(j+1);
            }
            System.out.println();
        }
        




    }
}
