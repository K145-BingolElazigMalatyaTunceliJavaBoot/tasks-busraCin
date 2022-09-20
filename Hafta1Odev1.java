
package hafta1odev1;

import java.util.Scanner;

/**
 *
 * @author busra cin
 */
public class Hafta1Odev1 {

    public static void main(String[] args) {
        /*
        vize notu toplam nota etkisi :%40
        final notunun toplam nota etkisi : %60 olacak şekilde işlem yaptım
       Okul puanlarının harf karşılığını yazan program.
       Random alınabilir değerler.
       0 - 35 arası FF
       35 - 50 arası DC
       50 - 70 arası BB
       70 - 100 arası AA
        */
        
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Lütfen vize notunuzu giriniz:");
        short vize = scr.nextShort();
        System.out.print("Lütfen final notunuzu giriniz");
        short finalNot = scr.nextShort();
        
        float toplam = (vize * 4/10.0f) + (finalNot * 6/10.0f);
        
        if(toplam < 35 && toplam>=0){
            System.out.println("Harf notunuz FF, Dersten Kaldınız, Not Ortalamanız :"+toplam);
        }
        else if (toplam >= 35 && toplam <50 ){
            System.out.println("Harf notnuz DC, Not Ortalamanız :"+toplam);
        }
        else if (toplam >= 50 && toplam <70 ){
            System.out.println("Harf notnuz BB, Not Ortalamanız :"+toplam);
        }
        else if (toplam >= 70 && toplam <=100){
            System.out.println("Harf notnuz AA, Not Ortalamanız :"+toplam);
        }
        else{
            System.out.println("Girdiğiniz not bilgisini kontrol ediniz, Not Ortalamanız :"+toplam);
        }
        
        
    }
    
}
