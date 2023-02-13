package practicenighttime08;

public class Edge extends Browser {

    String adresCubugu;
    public Edge(String adresCubugu) {
        this.adresCubugu=adresCubugu;
    }

    public Edge() {

    }


    @Override
    public void search() {
        System.out.println("Browser'lar Web sayfasında araştırma");

    }

    @Override
    public void sifreKaydetme(){
        System.out.println("Edge cookiesleri kabul edilenlerin" +
                " istenildiginde sifresini kaydeder");
    }
}
