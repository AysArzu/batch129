package day25inhetirance;

public class A01_Math extends A04_Lessons {

    public A01_Math(){
        super("str");//parent e gittik
        System.out.println("Math Constructor");

    }

public A01_Math(int a){
this();//aynı classın içindeki başka constr. çalışmasını sağlar
    System.out.println("Parametreli Math Constructor'ı");
}
}
