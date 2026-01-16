class twodarr{
    public static void main(String [] args){
        int [][] a = {
            {2,5,6,7},
            {3,6,2,9},
            {4,8},
            {9,5}
        };
        
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}