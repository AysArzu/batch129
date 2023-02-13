package ssg01.stringbuilder;

public class C05_Silme {
    public static void main(String[] args) {
        //soru 6) bir StringBuilder olusturun ve icinden karakter silin

        StringBuilder sb = new StringBuilder("java cok guzeldir");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);

    }
}

