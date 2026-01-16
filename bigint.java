import java.math.BigInteger;

class bigint{
    public static void main(String [] args){

        BigInteger a = new BigInteger("50000000000000000000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);

        BigInteger x = new BigInteger("12345678945687413641203658974643"); // this is the proof ie. we can work with this much level of long integers in a simple manner with this biginteger.
        BigInteger y = new BigInteger("2");

        System.out.println(x.multiply(y));
        System.out.println(x.divide(y));
        System.out.println(x.mod(y));
        System.out.println(x.pow(2));
    }
}