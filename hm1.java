import java.util.*;

class hm1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int size = sc.nextInt();
        int[] arr= new int[size];

        for(int i=1; i<size; i++){
            arr[i] = i*i;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}