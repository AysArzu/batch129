package practicenighttime08;

public class Browser {
    public static void main(String[] args) {
        String adresCubugu = "Her Browserda adres çubugu vardır.";
        Edge edge = new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();
        Edge edge2 = new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);
    }

    public void get() {
        System.out.println("Browser'lar Web sayfasına gider");
    }

    public void search() {
        System.out.println("Browser'lar Web sayfasında araştırma");

    }

    public void sifreKaydetme() {
        System.out.println("Browser'lar istenildiğinde şifreyi kaydeder.");
    }
}
