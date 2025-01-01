package OOPS;

public class practice_qn {
    public static void main(String[] args) {
        Complex c = new Complex(3,4);
        Complex d = new Complex(5,3);

        Complex e = Complex.sum(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    
    }
}

class Complex{
    int real;
    int imaginary;

    public Complex(int r,int i){
        real = r;
        imaginary = i;
    }

    public static Complex sum (Complex a ,Complex b){
        return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
    }

    public static Complex diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
    }

    public static Complex product(Complex a , Complex b){
        //(a+ib)(c+id) = (ac - bd)+i(ad + bc)
        return new Complex((a.real*b.real-a.imaginary*b.imaginary),(a.real*b.imaginary+a.imaginary*b.real));
    }


    void printComplex(){
        if(real == 0 && imaginary != 0){
            System.out.println(imaginary+"i");
        } else if(real !=0 && imaginary == 0){
            System.out.println(real);
        } else {
            System.out.println(real+" + "+"i"+imaginary);
        }
    }

}
