class basicstring{
    public static void main(String [] args){
        String s1 = "hello"; // s1 & s2 are stored in the string pool(refers same hello)
        String s2 = "hello";

        String s3 = new String("hello"); // s3 stored in heap memory(referes different)

        if(s1 == s2){
            System.out.println("s1 and s2 -> Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(s1 == s3){
            System.out.println("s1 and s3 -> equal");
        }else{
            System.out.println("s1 and s3 -> not equal");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 ->(content) equal");
        }else{
            System.out.println("s1 and s3 ->(content) not equal");
        }

        // --------------

        String str1 = "Java";
        System.out.println(str1.length());
        String str2 = "Welcome Home..";
        System.out.println(str2.length());
        System.out.println("Welcome".length());

        System.out.println(str2.replace("Home","Singapore"));
        System.out.println(str2);

        String a = "Hello";
        String b = "World";

        String concat = a+b;
        System.out.println(concat);

        String concat1 = a+ " "+b;
        System.out.println(concat1);

        System.out.println(a.concat(b));
        String concat2 = a+5; // 5 automatically turned into string
        System.out.println(concat2);

        int [] arr = {10,20,5};
        String concat3 = arr +b; // java implicitly calls toString() method on top of an array.
        System.out.println(concat3);

    }
}