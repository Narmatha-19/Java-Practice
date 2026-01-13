import java.util.*;
class mutable_string{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("I like Programming");
        System.out.println(sb);

        sb.append(" Languages especially Java and more..");
        System.out.println(sb);

        sb.replace(2, 6, "Love");
        System.out.println(sb);

        sb.insert(7," many ");
        System.out.println(sb);

        sb.replace(45, sb.length()," Python");
        System.out.println(sb);

        sb.delete(24,34);
        System.out.println(sb);

        String fin_str = sb.toString();
        System.out.println(fin_str); // String -> Immutable

        System.out.println(fin_str.replace("Python","C++"));
        System.out.println(fin_str);
    }
}