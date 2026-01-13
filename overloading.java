class overloading{
    static int add(int a, int b){
        return a+b;
    }

    static String add(String a, String b){
        return a+b;
    }

    static String add(int a, String b){
        return a+b;
    }
    public static void main(String [] args){
        System.out.println(add(5,10));
        System.out.println(add(5, " Apples"));
        System.out.println(add("Welcome ","Home"));
    }
}