class data{
    String name;
    int age;
    String location;

void display(){
    System.out.println("Name is:"+name);
    System.out.println("Age is:"+age);
    System.out.println("Location is:"+location);
}
}
public class student{
    public static void main(String[] args){
        data d = new data();
        d.name = "Harini";
        d.age = 21;
        d.location = "Chennai";
        d.display();

    }
}