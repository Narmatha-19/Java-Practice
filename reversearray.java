class reversearray{
    public static void main(String [] args){
        int [] arr = {5,10,15,20,25};
        int [] new_arr = new int[arr.length];
        int j =0 ;
        for(int i = arr.length-1; i>=0; i--){
            new_arr[j] = arr[i];
            j++;
            
        }
        
        for(int num : new_arr){
            System.out.print(num+" ");
        }
    }
}