
package hafta2;

public class car {
    
    private String color;
    private int daily;
    private int age;
    private String baggage;
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDaily() {
        return daily;
    }

    public void setDaily(int daily) {
        this.daily = daily;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }
    
    
    
    public car(String color, int daily,int age, String baggage){
        super();
        this.age= age;
        this.baggage=baggage;
        this.color=color;
        this.daily=daily;
        
    }
    
    
    
    public car(){
        
    }
    
    
    
    
    
    
    
}
