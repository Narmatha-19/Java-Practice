class ComplexNumber{
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void print(){
        System.out.println("Print using 'this' keyword: "+this);

        System.out.println("This.real = "+this.real);
        System.out.println("This.imaginary = "+this.imaginary);

        System.out.println(this.real+" + "+this.imaginary+"i");
    }

    public String toString(){ // instead of printing tha address of the complex_number (eg.: ComplexNumber@23fc625e) it returns this string.
        // return "This is a Complex Number";
        return this.real+" + "+this.imaginary+"i"; // instead of providing the string it returns the complex number.
        // for this we don't need the print() method.
    }

}

class this_keyword{
    public static void main(String[] args){
        ComplexNumber x = new ComplexNumber(-5, 8);
        // x.print();
        // System.out.println("X = "+x); // this returns the address of the x-complexnumber when we are not using toString method..

        System.out.println(x);
    }
}