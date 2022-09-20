
package hafta1odev2;

/**
 *
 * @author busra cin
 */
public class Hafta1Odev2 {
    //3 ile 100 arasında asal sayıların toplamını bulan program.
    
    public static boolean asal(int sayi){
    
        for(int i = 2; i < sayi ;i++){
            if(sayi %i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int toplam = 0;
        for(int i = 3; i < 100 ; i++){
           
            if(asal(i)){
                toplam +=i;
                
              }
        }
        System.out.println(toplam);
        
        
    }
    
    
    
    
}
