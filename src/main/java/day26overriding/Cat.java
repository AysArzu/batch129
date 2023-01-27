package day26overriding;

public class Cat extends Mammals{

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override // Override Annotation: Override kurallarının Java tarafından kontrol edilmesini sağlar.
    public void eat() {//Child'daki override edilmiş cat() method'una "Overriding Method" denir
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Animal create() {// Animal return type burada parentleri ve kendini yazabilir!!!
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a* b;
    }
}
