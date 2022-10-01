
package hafta2;

import hafta2.SUV;
import hafta2.hatchback;
import hafta2.user;
import hafta2.sedan;
import hafta2.car;

public class Hafta2 {

    public static void main(String[] args) {
       
        SUV SUV = new SUV();
        hatchback hatchback = new hatchback();
        sedan sedan = new sedan();
        
        hatchback.setAge(22);
        hatchback.setBaggage("big");
        hatchback.setColor("red");
        hatchback.setDaily(111);
        sedan.setAge(0);
        sedan.setBaggage("big");
        sedan.setColor("black");
        sedan.setDaily(112);
        SUV.setAge(11);
        SUV.setBaggage("big");
        SUV.setColor("blue");
        SUV.setDaily(230);
        
        
        user user = new user(false);
        user.rentACar(SUV, hatchback, sedan);
        user userRegistered = new user(true);
        userRegistered .rentACar(SUV, hatchback, sedan);

        
    }
    
}
