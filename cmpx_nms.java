class ComplexNumber{
    int real;
    int imaginary;

    // constructor

    ComplexNumber(int r, int i){
        real = r;
        imaginary = i;
    }

    ComplexNumber(){
        real = 5;
        imaginary = 10;
    }

    void print(){
        System.out.println(real +" + "+imaginary+"i");
    }

    
}

class cmpx_nms{
    public static void main(String[] args){
        ComplexNumber x = new ComplexNumber();
        // x.real = 2;
        // x.imaginary = 5;

        System.out.println(x.real);
        System.out.println(x.imaginary);

        x.print();

        ComplexNumber y = new ComplexNumber(); 
        // y.real = -5;
        // y.imaginary = 10; // these are without using constructor 
        y.print();

        ComplexNumber z = new ComplexNumber(8, 6);
        z.print();

        

    }
}