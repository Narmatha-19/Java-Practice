import java.util.*;
class car{
    String color = "Blue";
    String name = "Toyoto";
    float price = 1000000;
    boolean isLocked = false;

    void drive(){ System.out.println("Car is running...");}
    void lock() { isLocked = true; System.out.println("Car is Locked.."); }
    void unlock(){ isLocked = false; System.out.println("Car is unlocked.."); }

    float getprice(){
        return price;
    }

    void setprice(float priceValue){
        if(priceValue>0){
            price = priceValue;
        }
        else{
            System.out.println("Invalid priceValue..");
            price = 0;
            
        }
        
    }
}
class carmain{ // the filename should the class name of the main method.**
    public static void main(String[] args){ 
        car c1 = new car();
        car c2 = new car();

        System.out.println(c1.color);
        System.out.println(c2.color);
        c2.color = "RED";
        System.out.println(c2.color);

        c1.lock();
        c2.unlock();

        System.out.println(c1.isLocked);
        System.out.println(c2.isLocked);
       

        System.out.println(c2.getprice());

        c1.setprice(500); // we can set/update the price value
        System.out.println(c1.getprice()); 

        //importance of get&set. - we can easily update the values like - c1.price = -1000; this is invalid there is no price
        // will have -values. but it can't undergo any validations or conditions . so it can directly apply. 
        // so we use set method to have certain validations over there. 

        c2.setprice(-20);
        System.out.println(c2.price);

    }
}