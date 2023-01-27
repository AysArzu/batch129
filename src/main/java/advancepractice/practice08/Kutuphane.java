package advancepractice.practice08;

public class Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları,
    // adı, yazar adı,
    // sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static  int kitapSayisi;


    @Override
    public String toString() {
        return "Kutuphane{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", seriNo='" + seriNo + '\'' +
                '}';
    }

    public Kutuphane(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        kitapSayisi++;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        seriNo=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;

//kitapBilgileri(); dersek onje oluşturunca yeniden yazmamak için


    }public void kitapBilgileri(){
        System.out.println("kitapAdi : " + kitapAdi+"\nyazarAdi : " + yazarAdi+"\nsayfaSayisi : " + sayfaSayisi+"\nseriNo : " + seriNo);
        System.out.println("=============");
    }
}
