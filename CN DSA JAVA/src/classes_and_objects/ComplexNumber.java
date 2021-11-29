package classes_and_objects;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real,int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
    public void print()
    {
        System.out.println(real+"+ i"+imaginary);
    }
    public void  add(ComplexNumber c2)
    {
        this.real = this.real+c2.real;
        this.imaginary = this.imaginary+c2.imaginary;
        print();
    }
    public void multiply(ComplexNumber c2)
    {
        int real = this.real;
        this.real = (this.real*c2.real) -(this.imaginary*c2.imaginary);
        this.imaginary  = (this.real * c2.imaginary) + (this.imaginary*c2.real);
    }
}
