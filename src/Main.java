import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        double armut, armutFiyat= (float)2.14,
                elma,elmaFiyat=(float) 3.67,
                domates,domatesFiyat= (float) 1.11,
                muz, muzFiyat= (float) 0.95,
                patlican, patlicanFiyat=5;
        Scanner input = new  Scanner(System.in);
        System.out.println("Meyve kilosu giriniz: ");
        System.out.print("Kaç kilo armut aldınız: ");
        armut = input.nextFloat();
        System.out.print("Kaç kilo elma aldınız: ");
        elma = input.nextFloat();
        System.out.print("Kaç kilo domates aldınız: ");
        domates = input.nextFloat();
        System.out.print("Kaç kilo muz aldınız: ");
        muz = input.nextFloat();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlican = input.nextFloat();

        System.out.println("Armut= "+armut*armutFiyat);
        System.out.println("Elma= "+elma*elmaFiyat);
        System.out.println("Domates= " +domates*domatesFiyat);
        System.out.println("Muz= "+muz*muzFiyat);
        System.out.println("Patlican= "+patlican*patlicanFiyat);



    }

}
