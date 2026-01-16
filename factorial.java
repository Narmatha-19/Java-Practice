import java.math.BigInteger;
class factorial{
    public static void main(String [] args){
        int x = 5;
        int ans = 1;

        for(int i=1; i<=x; i++){
            ans = ans * i;
        }

        System.out.println(ans);

        //for bigger values we can't use int. we need to use BigInteger.

        BigInteger answer = new BigInteger("1");
        int y = 500;

        for(int i=1; i<=y; i++){
            BigInteger temp = new BigInteger(i+""); // for bigint you need to convert the i value also a bigint. 
            answer = answer.multiply(temp);
        }

        System.out.println(answer);
    }
}