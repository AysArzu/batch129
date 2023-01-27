package day23datetimestringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
     /*
       String oluşturmak için String Class var, StrigBUilder Class var ve StringBuffer kullanılabilir.
1) StringBuffer Javanın String üretmek için oluşturduğu ilk Classtır. Java 5 de üretilmiştir
2)StringBuffer "synchronized" dir. StringBuilder "synchronized"değildir.
3)StringBuffer "thread-safe"(multi-thread'e uygun) dir, StringBuilder "thread-safe" değildir.
4)StringBuffer ve StringBuilder ikiside mutable dir.

Note 1:Immutable String lazim oldugunda String Class kullaniriz.
Note 2:Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz.
Note 3:StringBuffer "Multithread" ve  "Synchronization" lazim oldugunda tercih edilir.
       StringBuilder "Multithread" ve  "Synchronization" gerekmezse tercih edilir.

Multi-thread= çoklu iş demek bir işi yaparken aynı anda başka işleri de yapmak bu işleri mantıklı sıralamaya synchronizating denir.
sıralama mantıklı değilse olmaz.
     */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

        System.out.println(sbf.capacity());//20 ==>16+4


    }
}
