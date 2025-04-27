package BölümSonuNesneyeDayalıSoruÇözüm;

public class HesapMakinesi {
    public static void main(String[] args) {
System.out.println("topla= "+HesapMakinesii.topla(10,12,14));
System.out.println("cikarma= "+HesapMakinesii.cikarma(10,12,14));
System.out.println("carpma= "+HesapMakinesii.carpma(10,12,14));
System.out.println("bolme= "+HesapMakinesii.bolmeYap(24,12,2));
System.out.println(HesapMakinesii.bolmeYap(24,0,2));
    if(HesapMakinesii.bolmeYap(40,5,2)!=-1){
        System.out.println("Bol="+HesapMakinesii.bolmeYap(40,5,2));
    }
    }
}

class HesapMakinesii{
    public static int topla(int...parametreler){
        int toplam=0;
        for(int parametre:parametreler){
            toplam+=parametre;
        }
        return toplam;
    }
    public static int cikarma(int...parametreler) {

        int cikar = parametreler[0];
        for (int i=1;i<parametreler.length;i++) {
            cikar = cikar - parametreler[i];
        }

        return cikar;
    }
    public static int carpma(int...parametreler){
        int carp=1;
        for(int parametre:parametreler){
            carp*=parametre;
        }
        return carp;
    }
    public static double bolmeYap(int...parametreler){
        double bolme=parametreler[0];
        for(int i=1;i<parametreler.length;i++) {
            if(parametreler[i]!=0){
                bolme=bolme/parametreler[i];
            }
            else
            {
                System.out.println("Parametrelerden biri 0 abolme yapılamadı");
                return -1;
                // -1 demek sıkıntılı bir değer görmüşüz anlamına gelir.
            }
        }
        return bolme;
    }



}
