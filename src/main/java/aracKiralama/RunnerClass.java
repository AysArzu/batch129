package aracKiralama;

import java.text.ParseException;
import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) throws ParseException {
        SehirSec obj=new SehirSec();
        obj.aractalep();
        MusteriveAracBilgileri user = new MusteriveAracBilgileri();

        user.aracBilgisi();
        user.musteriBilgileri();
        Tarih objtrh = new Tarih();
        objtrh.tarih();
        user.ucret();

    }
}
