public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        String ortaMetin = "ilginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        int vade = 36;

        double dolarBugun = 18.25;
        double dolarDun = 18.14;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }
        else if(dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Emekli"};

        for(int i=0; i<krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}
