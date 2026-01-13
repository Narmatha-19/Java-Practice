class varargs{
    float total = 0;
    static float getavg(float ...varargs){
        float total = 0;
        for(float num: varargs){
            total+=num;
        }
        
        float average = total/varargs.length;
        return average;
    }
    public static void main(String [] args){
        System.out.println(getavg(1,2,5,8));
        System.out.println(getavg(45,2,87,5,60,12));

        float avg1 = getavg(10,20,30);
        System.out.println(avg1);
    }
}