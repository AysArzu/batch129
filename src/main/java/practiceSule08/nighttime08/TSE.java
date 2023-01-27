package practiceSule08.nighttime08;

public abstract class TSE {
    public static void main(String[] args) {
        BagetEkmek baget = new BagetEkmek();
        baget.gramaj500();
        baget.hijyenikOlma();
        baget.odunAtesindePiser();
        baget.undanYapilir();
        System.out.println("**************");

DiyetEkmek diyet= new DiyetEkmek();
diyet.gramaj500();
diyet.hijyenikOlma();
diyet.odunAtesindePiser();
diyet.undanYapilir();

    }

    abstract void gramaj500();

    abstract void hijyenikOlma();

    void odunAtesindePiser() {
        System.out.println("TSE odun ateşinde pişer");
    }

    void undanYapilir() {
        System.out.println("TSE undan yapılır");
    };

}
