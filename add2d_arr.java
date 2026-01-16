import java.util.*;
class add2d_arr{

    static Scanner sc = new Scanner(System.in); // static scanner**
// we are calling the getmethod() inside the main method, so method should be static also we are accessing the variables
// ie. is also inside the main-static -- so variables also should be static. 
    public static void main(String[] args){

        System.out.print("Enter the values for rows & cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];
        int [][] b = new int[rows][cols];
        int [][] c = new int[rows][cols];

        System.out.println("Enter the values for the first array: ");
        getinput(a);
        System.out.println("Enter the values for the second array: ");
        getinput(b);

        System.out.println("The array values are: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

        
    }
    static void getinput(int [][]arr){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    arr[i][j] = sc.nextInt();
                    
                }
            }
        }
}