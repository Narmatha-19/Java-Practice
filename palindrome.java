import java.util.*;

class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = sc.next();

        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String rev= sb.toString();


        System.out.println( "Reversed String is:"+ rev);
        if(s1.equals(rev)){
            System.out.println("This String is Palindrome");
        }else{
            System.out.println("This String is not Palindrome");
        }

        
    }
}