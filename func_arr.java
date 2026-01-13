import java.util.*;

class func_arr{
    static String[] Heros(){
        String [] Cartoons = {"Bheem","Kaliya","Tom & Jerry","Chutki"};
        return Cartoons;
    }

    public static void main(String [] args){
        String [] arr = Heros();
        for(String character : arr){
            System.out.println(character);
        }
    }
}