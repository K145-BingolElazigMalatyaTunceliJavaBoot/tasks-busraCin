
package hafta2;

import hafta2.SUV;
import hafta2.sedan;
import hafta2.hatchback;



public class user {
    
    private final boolean user ;
    
    public user(boolean user){
        this.user=user;
    }
    
    
    public void rentACar(SUV SUV,hatchback hatchback,sedan sedan){
        if(user){
            System.out.println("İstediğiniz arabayı kiralıyabilirsiniz");
        }else System.out.println("Hachback araçlarını kiralamaya erişiminiz var");
    }

    
}
