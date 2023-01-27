package day28exceptions;

public class C03_Exception {
    public static void main(String[] args) {
        /*
        3) ArrayIndexOutOfBoundsException
         */
        //Bir String Array'den verilen indexteki datayı döndüren bir method oluşturunuz.

     String []arr={ "Ali", "Ayşe","Ebubekir","Ebrar"};
        getElementFromArray(arr,2);//Positive senario Ebubekir
        getElementFromArray(arr,0);//Positive senario Ali
        getElementFromArray(arr,4);//Negative senario ArrayIndexOutOfBoundsException
    }

    private static void getElementFromArray(String[] arr, int i) {

        try {
       //     System.out.println("nasılsın");trydan hemen sonra attığın sout çalışıyor!!!!
            System.out.println(arr[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin indexinde olmayan data istendi==> "+e.getMessage());
            //Arrayin indexinde olmayan data istendi==> Index 4 out of bounds for length 4
            e.printStackTrace();
            System.err.println("Burasi renkli açıklama");
        }

    }
}
