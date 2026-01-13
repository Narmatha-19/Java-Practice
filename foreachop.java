package com.company;
class foreachop{
    public static void main(String [] args){
        int [] arr = {5,4,2,8,1};
        int key = 10;

        boolean found = false;

        for(int num: arr){
            if(num == key){
                found = true;
                break;
            }
        }
            
        if(found){
            System.out.println("Key is Found..");
        }else{
            System.out.println("Key not Found..");
        }
    }
}