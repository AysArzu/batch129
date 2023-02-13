package ssg01.stringbuilder;

public class C02_Ekleme {
    public static void main(String[] args) {

        //soru 2)StringBuilder Classindaki ekleme methodlarina bakiniz

        StringBuilder sb = new StringBuilder();
        sb.append("sehirlerdeki ");
        System.out.println(sb);
        sb.append(" guzeldir");
        System.out.println(sb);
        //sb.append("hava cok guzeldir ",0,4);
        // System.out.println(sb);
        sb.insert(13, "hava", 1, 2);
        System.out.println(sb);
    }
}
