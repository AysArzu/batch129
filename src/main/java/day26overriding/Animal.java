package day26overriding;

public class Animal {
    /*
    1)Parent Class'daki methodu Child Class içinde ozelleştirerek kullanmaya "Overriding" yapmak denir
    2)Overriding'de methodun parantezine, Method'un ismine dokunulmaz, method'un body'si değiştirilir.
    3)Override Annotation: Override kurallarının Java tarafından kontrol edilmesini sağlar.
    4)Overriding'de parent class'daki method'a "Overridden Method" , child class'daki  method'a ise "Overriding Method" denir.
    5)"Private" methodlar "override" edilemezler.
    6) Child Class"daki override edilmiş method(Overrriding method)'un access modifier'i
      Parent Class'daki override edilmiş method(Overridden Method)'un access modifierinden dar olamaz.(child parent e sınır koyamaz
      Overrridden Method==>protected ise Overriding Method==>protected + public
      Overrridden Method==>default ise Overriding Method==>default + protected + public
      Overrridden Method==>private ise Overriding Method==>override olmaz ki access modifier'i olsun.(Bknz 5.kural
    7)Child Class'da override edilen methodun(overriding Method) return type'ı methodun
      return ettiği data type'inin aynısı veya o data type'inin parenti olarak seçilebilir
    8)Method'un return type'ı primitive ise Overriding yaparke return type değiştirilemez.
      çünkü return type ya aynı olur veya parentten seçilir. ama primitive'ler arasında "parent child ilişkisi"
      olmadığından parent'ten seçmek mevzu bahis olamaz. o zaman tek seçenek aynısı olmalıdır.
    9)Method'un return type'ı "Wrapper Class" ise Overriding yaparken return type değiştirilemez. çünkü return type ya aynı olur veya
      parentten seçilir. ama Java bir wrapper class'i diğerinin parenti yapmadığından parent'dan
      seçme ihtimali yoktur, geriye sadece aynısı olma ihtimali kalır.
    10)Method'un return type'ı "void" ise Overriding yaparken return type değiştirilemez.
    11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez
        12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz
        13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" method'lar ve "static" method'lar "override"  edilemezler.(main method static)
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic(non-static) Polymorphism" dir.
        18)Overloading'de method signature farklı olmalıdır fakat Overriding'de method signature aynı olmalıdır.
        19)static, private, ve final method'lar override edilemezler fakat overload edilebilirler.
        20)Overriding için inheritance sarttir fakat Overloading için inheritance sart değildir
     */
    public void eat(){//Parent'daki override edilmiş cat() method'una "Overridden Method" denir
        System.out.println("Animals eat...");
    }public void drink(){
        System.out.println("Animals drink...");
    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }

}
