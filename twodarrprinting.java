// printing the 2d array in column wise...

import java.util.*;
class twodarrprinting{
    public static void main(String [] args){
        int [] [] a = { 
            {12,45,78},
            {52,58,89},
            {85,41,40},
            {20,10,30}
        };
        
        int rows = a.length;
        int cols = a[0].length; // length of the first row

        System.out.println("Array values are: ");

        for(int j = 0; j< cols; j++){
            for(int i = 0; i<rows; i++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}