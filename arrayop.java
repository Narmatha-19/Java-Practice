import java.util.*;

class arrayop{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values for array:");
        for(int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }

        int ans = -1;
        System.out.print("Enter the key value:");
        int key = sc.nextInt();

        for(int i = 0; i<size;i++){
            if(arr[i] == key){
                ans = i;
                // System.out.println("The index of the key: "+key+" is: "+ ans);
                break;
            }
        }
        // ----[or]-----
        for(int i= size-1; i>=0; i--){
            if(arr[i] == key){
                ans = i;
                break;
            }
        }
        // System.out.println("There is no value is here..:  Answer is : "+ ans);
        System.out.println(ans);
        
    }
}
