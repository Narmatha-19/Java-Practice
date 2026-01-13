import java.util.*;

class twoarray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        int [] new_arr = new int[n];

        System.out.println("Enter the elements for first array: ");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for second array: ");
        for(int i = 0; i<n; i++){
            new_arr[i] = sc.nextInt();
        }

        int k = 0;
        
        int [] final_arr = new int[n];
        for(int i = 0; i<n;i++){
            for(int j=0; j<n; j++){
                if(arr[i] == new_arr[j]){
                    final_arr[k] = arr[i]; // instead use final_arr[k++] = arr[i]; which is equal to the line 28 and 29
                    k++;
                    break; // to avoid duplicate values
                }
            }
        }
        System.out.print("First Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("Second Array: ");
        for(int num: new_arr){
            System.out.print(num+" ");
        }
        System.out.println();
        
        System.out.print("Final Array: ");
        // either this
        for(int num: final_arr){
            System.out.print(num+" ");
        }
// final array size was initialized as "n" - so large space, remaining are considered as '0'. While using 'k' it is 
// desired as index of the duplicated value. '0' is not repeated in this.
        System.out.println()
        System.out.println("k - value",k);

        // or this..
        for(int i=0; i<k;i++){
            System.out.print(final_arr[i]+ " ");
        }


        // for your reference ---- some differences on array while using with int, char and string- here are theyy

        int [] 1_arr = {12,45,10};
        System.out.println(1_arr); // returns the address of the array

        char [] 2_arr = {'a','m','m','u'};
        System.out.println(2_arr);  // returns the characters 

        String [] 3_arr2 = {"Haii", "Hello", "Namaskar"};
        System.out.println(3_arr); // returns the address of the array

    }
}