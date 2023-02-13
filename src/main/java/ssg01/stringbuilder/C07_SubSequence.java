package ssg01.stringbuilder;

public class C07_SubSequence {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java cok guzeldir");
        System.out.println(sb1.subSequence(5, 8));//cok
        System.out.println(sb1.substring(5));//cok guzeldir
        System.out.println(sb1);//Java cok guzeldir
    }
}
