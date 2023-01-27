package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);// 5

        //Increment 1:
        a = a + 2;// veya a += 2;
        System.out.println(a);// 7

        //Example 1: Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int b = 10;
        System.out.println(b);// 10

        b = b+5;
        System.out.println(b);// 15

        b += 5;
        System.out.println(b);// 20

        //Decrement
        int c = 8;
        System.out.println(c); // 8

        c = c-3;
        System.out.println(c); // 5

        c -= 3;
        System.out.println(c); // 2

        //Increment 2:
        int d = 6;
        System.out.println(d);// 6

        d = d*2;
        System.out.println(d);// 12

        d *= 2;
        System.out.println(d);// 24

        //Decrement 2:
        int e = 24;
        System.out.println(e);// 24

        e = e/2;
        System.out.println(e);// 12

        e /= 2;
        System.out.println(e);// 6

        //"1" ile increment
        int f = 12;

        //f = f + 1;
        //f += 1;
        f++;

        //"1" ile decrement
        int h = 10;

        //h = h - 1;
        //h -= 1;
        h--;

        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++;// post-increment cunku increment, variable'in isminden sonra yazildi

        System.out.println(k);//10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i);//11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur.

        int m = 15;
        int n = ++m;// pre-increment cunku increment, variable'in isminden once yazildi

        System.out.println(m);// 16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur.
        System.out.println(n);// 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n" nin degeri 16 olur.

        /*/"post-decrement" ve "pre-decrement"
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

        int a=12;
        int b=a++;
        System.out.println("b = " + b);//12
        System.out.println("a = " + a);//13

        int x= 15;
        int y=x--;  //PostDecrement
        System.out.println("x = " + x);//14
        System.out.println("y = " + y);//15

        int m= 21;
        int n=++m;//Pre Increment
        System.out.println("m = " + m);//22  21    21
        System.out.println("n = " + n);//22   21   22

        int t=32;
        int u=--t;
        System.out.println("t = " + t);//31  33
        System.out.println("u = " + u);//31  33


        int a = 12;
        int b = a++;//Post Increment
        System.out.println(b);
        System.out.println(a);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);
        System.out.println(y);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);
        System.out.println(n);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);
        System.out.println(u);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayı = 10;
        sayı++;
        System.out.println(sayı);//11
        sayı++;
        System.out.println("pre-incrementten once " + sayı);//12
        System.out.println(" pre-increment satırında " + ++sayı);//13
        System.out.println("pre-incrementden  sonra" + sayı);//13

        System.out.println("post-increment satırında" + sayı++);//13
        System.out.println("post-incrementdan sonra " + sayı);//14
        System.out.println(9f / 2f);//4.5
        System.out.println(9 / 2);//4

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);//15
        System.out.println(num);//16

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);//11 10 30    61

        sayı3 = ++sayı1;
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);

        System.out.println(sayı3++);//12

        System.out.println(--sayı2);//9

        System.out.println(sayı3++);//13

        System.out.println(sayı3);//14
*/

    }
}
