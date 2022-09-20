
package hafta1odev4;

import java.util.Random;

/**
 *
 * @author busra cin
 */
public class Hafta1Odev4 {

    public static void main(String[] args) {
        /*
        0 ile 500 aralığında ve
        Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
        50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
        */
        
        Random rnd = new Random();
        int i = 1;
        
        for( ; i<500 ;i++){
            
          int sayi = rnd.nextInt(500);
          // System.out.println(sayi);  doğruluğunu kontrol için yazdığım blok
 
            
          if(sayi<= 100 && sayi >= 50){
              
            System.out.println(sayi);
            break;
            
            }
        }System.out.println(i+".da buldu");
  
        
    }
    
}
