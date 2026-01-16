
class Car{
    String model;
    String color;
    float price;
    boolean isLocked = true;

    Car(){ // Default Constructor
        model = "Thar";
        color = "Black";
        price = 1500000;

    }

    Car(String modelname, String modelcolor,float priceValue){ // Parameterized Constructor
        model = modelname;
        color = modelcolor;
        setprice(priceValue);
    }

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
class Constructor_eg{
    public static void main(String[] args){
        Car c1 = new Car("Benz", "Red",5000000);
        Car c2 = new Car();

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);

    }
}
