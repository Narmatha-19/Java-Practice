class str_to_arr{
    public static void main(String [] args){
        String str = "Hello";
        char [] arr = {'H','e','l','l','o'};

        System.out.println(str);
        System.out.println(arr);

        String str1 = arr.toString();
        System.out.println(str1); // this shows the address of the array

        String str2 = new String(arr); // Array to String Conversion
        System.out.println(str2);

        char [] arr1 = str.toCharArray(); // String to Array conversion
        System.out.println(arr1);
    }
}