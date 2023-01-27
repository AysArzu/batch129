package advancepractice.practice11;

import java.io.*;

public class TextOkumaYazma {
    public static void main(String[] args) throws IOException {
        //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonuna yazdıran bir kod yazınız.

        FileReader fr= new FileReader("src/main/java/advancepractice/practice11/Helloword");
        BufferedReader br=new BufferedReader(fr);
        String satir=br.readLine();
        String yeniDosya="";
        
        while (satir!=null){
            System.out.println("satir = " + satir);
       yeniDosya+=  satir+"==> satir kelime sayisi: "+   satir.split(" ").length+"\n";

           satir= br.readLine();
        }
        System.out.println("yeniDosya = " + yeniDosya);
        br.close();

        FileWriter writer= new FileWriter("src/main/java/advancepractice/practice11/Helloword");
        writer.write(yeniDosya);
        writer.close();
    }
}
