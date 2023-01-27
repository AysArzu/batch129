package practiceSule08.nighttime08;

public class StringBuilderKiyas {
    /* String builder ile 1000 defa islem yapalim. Oncesinde ve sonrasinda zamani kontrol edip
    StringBuilder ve String classlarin performansini karsilastiralim
    Ipucu: long Timesb=System.nanoTime
     */
    public static void main(String[] args) {

        String str="merhaba";
        long time1=System.nanoTime();//kronometre
        for (int i = 0; i < 1000; i++) {
            str+=" ";
        }
 long time2=System.nanoTime();
        long stringSure=time2-time1;

        /////////////////////////////////////////////////////////////////////
        StringBuilder sb=new StringBuilder("Merhaba");
        long time3=System.nanoTime();
        for (int i = 0; i <1000 ; i++) {
            sb.append(" ");
        }
        long time4=System.nanoTime();
        long stringBuilderSure=time4-time3;
        System.out.println("stringBuilderSure = " + stringBuilderSure);
        System.out.println("stringSure = " + stringSure);
        if(stringBuilderSure>stringSure){
            System.out.println("stringBuilderSure daha yavas= " + stringBuilderSure);
        }else if(stringSure>stringBuilderSure){
            System.out.println("stringSure daha yavas = " + stringSure);
        }else System.out.println("ikisi ayni surede calisti");
    }
}
