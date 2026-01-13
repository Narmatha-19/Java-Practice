import java.util.*;
class arrayminmax{
    public static void main(String [] args){
        int [] arr = {12,45,100,10,63,8};
        int min = arr[0];
        int max = arr[0];
        // for(int num : arr){
            // if(num< min){
                // min = num;
            // }
            // else if(num > max){
                // max = num;
            // }
        // }
//  In a single for loop we can get both answers..
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The minimum value of the array:"+min);
        System.out.println("The maximum value of the array:"+max);
    }
}