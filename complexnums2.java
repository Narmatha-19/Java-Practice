class ComplexNumber{

    int real;
    int imaginary;


ComplexNumber(int r, int i){ 
    real = r;           //// the data inside the paranthesis should be on the right side..
    imaginary = i;
}

void print(){
    System.out.println(real+" + "+imaginary+"i");
}
// this is the method named add
    ComplexNumber add(ComplexNumber y){ // this is like int add(int a) -- this is the returntype(not class or constructor name)
        int realsum = real + y.real;
        int imagsum = imaginary = y.imaginary;
        ComplexNumber  result = new ComplexNumber(realsum,imagsum); // to change the added value into complex numbers
        return result;
    }
}

class complexnums2{
    public static void main(String[] args){
        ComplexNumber x = new ComplexNumber(2,3);
        x.print();
        ComplexNumber y = new ComplexNumber(5,7);
        y.print();

        ComplexNumber z = x.add(y);
        z.print();

    }
}