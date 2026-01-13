import java.util.*;
class func_basic{

    static int square(int n){
            return n*n;
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        System.out.println("The square is: "+square(num));
    }
}