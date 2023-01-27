package mentoring;

public class Example01 {
    public static void main(String[] args) {
        /* 8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
        String cml="Java";
        String trs="";
        for (int i=cml.length()-1; i>=0;i--){
            trs+=cml.charAt(i);
        }
        System.out.println(trs);

        9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız
        Test Data:
        str1: Java is
        str2: fun
        Beklenen Çıktı:
        java is fun

        String a="Java is";
        String b="fun";
        System.out.println(a+" "+b);

        10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
        Test Data:
        Java is easy
        Aranan String: is
        Beklenen Çıktı:
        True
        Aranan String: and
        Beklenen Çıktı:False
        String a="Java is easy";
        String aranan="and";
        boolean varMi= a.contains(aranan);
        System.out.println(varMi);

        11----
        Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.
        Test Data:
        good
        Beklenen Çıktı:
        goo
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz");
        String ifade=input.nextLine();

        String yazacak=ifade.substring(0,ifade.length()-1);

        System.out.println(yazacak);
         12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.
    Test Data:
    Java is fun
    Beklenen Sonuç:
    JAVA IS FUN

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz");
        String cumle=input.nextLine().toUpperCase();
        System.out.println(cumle);

    13----*********************************************************
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan
    bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.
    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
    Test Data:
    madam
    Beklenen Çıktı:
    True
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz");
        String cumle = input.nextLine().toLowerCase();
        String bos = "";
        for (int i = cumle.length() - 1; i >= 0; i--) {
            bos += cumle.charAt(i);
        }
        System.out.println(bos);
if (cumle.equals(bos)){
    System.out.println("palindromdur");
}else System.out.println("palindrom değildir");
************************************************************************
    14----
    Girilen iki String veriyi karşılaştıran Java kodu yazınız.
    Test data:
    1. String : techproed.com
    2. String : Techproed.com
    Beklenen Çıktı:
    False
    Test data:
    1. String : techproed.com
    2. String : techproed.com
    Beklenen Çıktı:
    true
    ************************************************************************

String a="techproed.com";
String b="techproed.com";
        System.out.println(a.equals(b));
15----
    Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
    Test Data:
    Java is fun
    Beklenen Çıktı
    0. pozisyondaki karakter : J
    5. pozisyondaki karakter : i

        String harfBulma="Java is fun";
        harfBulma.charAt(0);
        harfBulma.charAt(5);
   16----*****************
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
    Test Data:
    java is fun
    Beklenen Çıktı:
    JAVA IS FUN
    ***********************************************************************
 Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String cumle = input.nextLine().toUpperCase();
        System.out.println(cumle);
 17---***********************************************
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
    Test data:
    12,24,34
    Beklenen Çıktı:
    12

        int a=12, b=24, c=34;
        int min=a;
        if(b<a){
            min=b;
       } else if (c<b) {
            min=c;
}
    System.out.println(min);
        18----*******************************************************
    Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
    Test Data:
    java is fun
    Beklenen Çıktı:
    Stringdeki sesli harf sayısı: 4
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir string ifade giriniz");
        String cumle = input.nextLine().toLowerCase();
        int count=0;
        for (int i = 0; i < cumle.length(); i++) {

            switch (cumle.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
               count ++;
}
    } System.out.println(count);
 ************************************************************************
    19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.
    Test Data:
    2017
    Beklenen Çıktı:
    false

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yıl  giriniz");
        int yil=input.nextInt();


        boolean artikYilMi=(yil%100==0&&yil%4!=0||yil%400==0) ? true:false;
        System.out.println(artikYilMi);
        ************************************************************************
    20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.
    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]
    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]

        int[] arr1={1232, 1134,2345,1022};
        String [] arr2={"Java", "Python","PHP", "C#","C Programming", "C++"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        ************************************************************************
    21----
    Array deki sayıları toplayan Java kodunu yazınız.
    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Beklenen Çıktı:
    Array toplamı: 55

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        for (Integer w : arr) {
          sum+=w;
        }
        System.out.println(" Array toplamı: "+sum);

       ************************************************************************
       22----
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        Array =  [20, 30, 25, 35, -16, 60, -100 ]
       Beklenen Çıktı:
       Array Sayılarının ortalaması: 7.0

        int[]arr={20, 30, 25, 35, -16, 60, -100};
        int sum=0;

        for (int w:arr) {
            sum+=w;
        }
        double ortalama =sum/arr.length;
        System.out.println("Array Sayılarının ortalaması: "+ortalama);

************************************************************************
    23----
    Aşağıdaki girdi şeklini yazan Java Kodunu yazınız.

    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0



        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {
                System.out.print(0+" ");
            }
            System.out.println();}

************************************************************************
    24----
    yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:True
    Aranan Değer:2010
    Beklenen Çıktı :False

        String[] arr = {"1551", "1223", "1443", "1267", "1789", "1023", "2020"};
        String arananDeger = "2020";
        boolean varMi = false;
        for (String s : arr) {
            if (s.equals(arananDeger)) {
                varMi = true;
                break;
            }else varMi=false;


        }System.out.println(varMi);
************************************************************************
    25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
    Array: [12,15,43,23,56,76,78,90,77,43]
    Aranan değer:56
    Beklenen Çıktı:
    56 sayısı arrayin 5. elemanı

        int []arr={12,15,43,23,56,76,78,90,77,43};
        int aranan=56;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.binarySearch(arr,56);
        System.out.println(  Arrays.binarySearch(arr,56));

       ************************************************************************
    26-----
    Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]

        String []arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String > arrList=Arrays.asList(arr);
        System.out.println(arrList);
        ************************************************************************
 27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
    Array: [1232,2345,5467,678,3454,2312,3451]
        int[] arr = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ikinciMax = arr.length - 2;
        System.out.println(arr[ikinciMax]);
************************************************************************
    28----
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
    Array: [1,2,3,4,5,6,7,8,9]
    Beklenen Çıktı:
    Tek Sayilar: 5
    Cift Sayilar: 4

        int counterTek=0;
        int counterCift=0;
        int[]arr={1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            if(i%2==0){
                counterCift++;
            }else counterTek++;
        }
        System.out.println("Tek Sayilar: "+counterTek+"\nCift Sayilar: "+counterCift);
************************************************************************
    29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"

        String sentence = "Java is fun";
        String reversed="";
        String[] arr= sentence.split(" ");

        for (int i = arr.length-1; i >=0 ; i--) {
           reversed+=arr[i]+" ";
        }
        System.out.println(reversed);
30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.
    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010
    Beklenen Çıktı:
    1010100

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci binary sayısını giriniz");

        String num1 = scan.next();
        System.out.println("İkinci binary sayısını giriniz");
        String num2 = scan.next();
        int n1=Integer.parseInt(num1,2);
        int n2=Integer.parseInt(num2,2);
        int n3=n1+n2;
        System.out.println(" birinci binary number: "+Integer.toBinaryString(n1));
        System.out.println(" ikinci binary number: "+Integer.toBinaryString(n2));
        System.out.println(" iki  binary number toplamı : "+Integer.toBinaryString(n3));

        ************************************************************************
        31----
        Saati saniyeye çeviren java methodunu yazınız.
        Test Data:
        howManySeconds(2);
        Beklenen çıktı:
        7200
        howManySecond();
    }
    private static void howManySecond() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saniyeye çevirmek için saat giriniz");
        int saat=scan.nextInt();
        System.out.println(saat*60*60);

         ************************************************************************
    32----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
    num1 = num2 => true
        int num1=54;
        int num2=53;
        boolean esitMi=false;
        if(num1==num2) {
            esitMi = true;
        } else
                esitMi=false;
         System.out.println(esitMi);

************************************************************************
    33-----
    Bir arrayi tersine çeviren  method yazınız.
    Test Data:
    reverse [1, 2, 3, 4]
    return  [4, 3, 2, 1]


        String reverse = "";

        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[idx] += arr[i];
            idx++;
        }


        System.out.println(Arrays.toString(arr2));
        ************************************************************************
    34-----
    String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])
     ["Pair"]

        String[] arr = {"Tomato", "Potato", "Pair"};
        boolean isFourLetters = false;
        for (String s : arr) {
            if (s.length() == 4) {
                isFourLetters = true;
            }
        }
        if (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() == 4) {
                    System.out.println(arr[i] + " ");
                }
            }

        }
          ************************************************************************
            35----
            Methoda iki sayı girelim ve  bize bir array dönsün.
             Array elemanları 1.sayının 2. sayı kadar kendisi ile
             toplamından oluşsun.
            Test Data:
            arrayOfMultiples(7, 5)
            sonuç: [7,14,21,28,35]

        Scanner input = new Scanner(System.in);
        System.out.println("Array oluşturmak için iki sayı giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int[] arr = new int[sayi2];
        for (int i =1; i <= sayi2; i++) {
           arr[i-1]= sayi1*i;
        }
        System.out.println(Arrays.toString(arr));
        ************************************************************************
            36-----
            Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
            Test Data:
            isPrime(31)
            true
            isPrime(18)
            false

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();
        boolean isPrime=false;
        for (int i = 1; i <sayi ; i++) {
            if(sayi%i==0){
                isPrime=false;

            }else { isPrime=true;
        }


    } System.out.println(isPrime);
     ************************************************************************


         /* ***********************************************************************
    38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
int []arr={10, 15, 20, 2, 10, 6};
Arrays.sort(arr);
   int min=arr[0];
   int max=arr[1];
        for (int j : arr) {
            min = Math.min(j, arr[0]);
            max=Math.max(j,max);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("max : "+max+ " ile min : "+min+" arasındaki fark: "+ (max-min));

         *****************************************************************
    39-----
    Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.
    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.

        sumnegatifCountPozitif(Integer[] arr);


    }int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

    public static void sumnegatifCountPozitif(int[]  arr) {

        int counter = 0;
        int sumNegatif = 0;
        for (int i : arr) {

            if (i >= 0) {
                counter++;
            } else if (i < 0) {
                sumNegatif += i;

            }
        }
        System.out.println("Tüm negatif sayıların toplamı  = " + sumNegatif + "'tir.\nToplam " + counter + " pozitif sayı var.");*/
    }
}


