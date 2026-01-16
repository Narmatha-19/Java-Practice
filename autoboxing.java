class autoboxing{
    public static void main(String [] args){
        int x = 5;
        float f = 3.16F;
        long l = 6000;

// autoboxing
        Integer intobj = x;
        Float floatobj = f;
        Long longobj = l;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.max(5,9));

        Integer n = 5;
        int nn = 10;

    }
}