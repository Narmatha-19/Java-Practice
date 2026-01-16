import java.math.BigInteger;

class bigint2{
    public static void main(String[] args){

        long x = 50;
        BigInteger a = new BigInteger(x+"");
        System.out.println(a);

        BigInteger b = new BigInteger("99999412554876");
        int y = b.intValue();
        System.out.println(b);
        System.out.println(y); //int value gives -answers- because int overflowed..

        long z = b.longValue();
        System.out.println(z);


    }
}