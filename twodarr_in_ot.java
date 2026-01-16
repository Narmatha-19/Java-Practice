import java.util.*;
class twodarr_in_ot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value for rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];

        System.out.print("Enter the value for the array matrices: ");
        for(int i=0; i<a.length; i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array values are: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}