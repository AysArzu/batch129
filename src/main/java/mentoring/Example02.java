package mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
/*
        Soru 1:Verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int arr[]={3,5,6,1,9,45,25,4,9,0};
        String brr="";
        Arrays.sort(arr);
        System.out.println("arr Array'inin sıralanmış hali = " +Arrays.toString(arr) );
        for (int i = arr.length-1; i >=0 ; i--) {
            brr+=arr[i]+" ";
        }
        System.out.println(brr);*/

/* ***********************************************************************************
        Soru 2:Verilen array da istenen bir elementin var olup olmadıgını
        true false olarak yazdirarak gosteren bir method olusturun

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz");

        String rakam = input.next();
        int counter = 0;
        int[] arr = {0, 1, 3, 4, 5, 6, 9, 9, 25, 45};
       String con=Arrays.toString(arr);
        System.out.println(con.contains(rakam));
        *******************************************************
  Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
        int arr[][]={{3,1,7},{6,10,2}};
        int sum=0;
        int arr[][]={{3,1,7},{6,10,2}};
        for (int[] w : arr) {
            for (int s : w) {
                sum+=s;
            }
        }
        System.out.println(sum);
****************************************************************************
 Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
        arrayi olusturup elementlei kullanicidan alip arraye atayin

        Scanner input = new Scanner(System.in);
        System.out.println("Arrayimiz kaç elemanlı olacak? Giriniz");
        int arr = input.nextInt();

        int brr[] = new int[arr];

        int idx;
        do {
            System.out.println("Array'e gireceğiniz rakamları giriniz");
            int rakam = input.nextInt();
            idx = 0;
            for (int i = 0; i < arr; i++) {
                System.out.println("Lütfen "+ (i+1)+". sayıyı giriniz");
                brr[i]=input.nextInt();
                idx++;
            }
        } while (idx>arr);

        System.out.println(Arrays.toString(brr));
***************************************************************
       Soru 5:Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = input.nextLine().trim();

        String[] str = cumle.split(" ");
        int a = str.length;
        System.out.println("Arrayin eleman sayısı " + a);
**************************************************************************
 Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }

        int [][] arr={ {1,2,3}, {4,5}, {6} };
        int carpim=1;
        for (int i=0;i< arr.length;i++){
            for (int j = 0; j <arr[i].length ; j++) {
                if(j==arr[i].length-1){
                    carpim*=arr[i][j];
                }
            }
            System.out.println(carpim);
        }*/

       /*  Soru 7:Verilen bir Arrayden istenen elementi silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
        int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sileceğiniz rakamı giriniz");
        int rakam=input.nextInt();
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        String brr="";
        for (int i : arr) {
            if(i!=rakam){
                brr+=i+" ";
            }
        }
        System.out.println(brr);
        String [] arr2=brr.split(" ");
        System.out.println(Arrays.toString(arr2));
****************************************************************

     Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir method olusturun
        orn: [1,3,5,3,5,6,1,7]
        output [1,3,5,6,7]

           int[]arr={1,3,5,3,5,6,1,7};
           String s="";
        for (int i = 0; i < arr.length ; i++) {
            if(s.contains(arr[i])){
        }
            }
        }

        Soru 9:Verilen bir listede istenen iki indexdeki elementlerin yerini kalici olarak degistiren bir method olusturun*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yerlerini değiştireceğiniz iki numarayı giriniz");
        int rakam1=input.nextInt();
        int rakam2=input.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(9);
int idx1=list.get(rakam1);
int idx2=list.get(rakam2);

 for (int i = 1; i < list.size(); i++) {
            if (i == rakam1) {
                list.remove(rakam1);
                list.add(rakam2, idx1);
                if (i == rakam2) {
                    list.remove(rakam2);
                    list.add(rakam1, idx2);


                }
            }
        }  System.out.println("Degisen liste= "+list+"-");
    }}

         /*
        Soru10: Parametre olarak bir int ve istedigimiz kadar String alan en uzun kelimenin harf sayisi ile int parametre degerini
        carpip sonucu yazdiran bir method olusturun

        Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

        int[][] arr = {{10, 20, 30}, {4}, {6, 7, 20}};
        int sum = 0;

        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            brr[i] = sum;
            sum = 0;
        }

        System.out.println("brr arrayi= " + Arrays.toString(brr));
   *******************************************************************************************************
         Soru12:Bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6


        int[] arr = {1, 2, -3, 4, -5, -6};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            brr[i] =arr[i]* (-1);
        }
        System.out.println(Arrays.toString(brr));
    }
      *****************************************************************************************************
       Soru13:Verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
        yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

    int[] arr= {5,7,-6,4,2,15,3,8,1};
      int istenenToplam=9;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(istenenToplam!=arr[i]+arr[j])
                {
                    continue;
                }else

            System.out.println(arr[i] + " ile "+arr[j]+ " toplamı: "+ istenenToplam);
        }

}}}*******************************************************************************
  Soru14:Write a java program that calculates the average value of array elements Print elements that are greater than avarage
                (dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
        input[]= {1,2,3,4,5,6,7}
        Output : 4

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }  int ortalama=sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ortalama){
                continue;

            }else
         System.out.print(arr[i]+" ");
    }***************************************************************************
    Soru15: $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");
        String a = "";
        String b = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                a += arr[i] + " ";
            } else {
                b += arr[i] + " ";
            }
        }
        System.out.println(a + " a " + b + " b");
        a = a.replaceAll("[$]", "");
        b = b.replaceAll("£", "");
        String[] x = a.split(" ");
        String[] y = b.split(" ");
        int sumDolar = 0;
        int sumEuro = 0;
        for (String w : x) {
            sumDolar += Integer.valueOf((w));
        }
        System.out.println("sumDolar = $" +sumDolar);
        for (String w : y) {
            sumEuro += Integer.valueOf((w));
        }
        System.out.println("sumEuro = £" + sumEuro );   */



        /*

        Soru16:given an int array and find the squares of the elements (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}

        int[] a = {2, 6, 4, 5, 8, 9};
        for (int i : a) {
            System.out.print(i * i + " ");
        }
*/

     /*  Soru17:Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
                INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT : [Veli,Omer]
        List<String> isimler = new ArrayList<>();
        List<String> asizIsimler = new ArrayList<>();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayse");
        isimler.add("Fatma");
        isimler.add("Omer");

        for (int i = 0; i < isimler.size(); i++) {

            if (!(isimler.get(i).contains("a") || isimler.get(i).contains("A"))) {
                asizIsimler.add(isimler.get(i));
            }

        }
        System.out.println(asizIsimler);

    }
}
        */
