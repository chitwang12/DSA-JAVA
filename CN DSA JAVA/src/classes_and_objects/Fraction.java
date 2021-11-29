package classes_and_objects;

public class Fraction {
   private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        if(denominator==0)
        {

        }
        this.denominator =denominator;
        simplify();
    }
    public void print()
    {
        if(denominator == 1)
            System.out.println(numerator);
        else
            System.out.println(numerator+"/"+denominator);
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
        simplify();
    }

    public int  getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator) {
       if(denominator == 0)
           //error out
           return;

        this.denominator = denominator;
        simplify();
    }

    private void simplify()
    {
        int gcd =1;
        int smaller = Math.min(numerator,denominator);
        for(int i = 2;i<=smaller;i++)
        {
            if(numerator % i==0 && denominator % i == 0)
            {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public static Fraction add(Fraction f1,Fraction f2)
    {
        int newNum = f1.numerator*f2.denominator + f2.numerator * f1.numerator;
        int newDen = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNum,newDen);
        return f;
    }
    public void add(Fraction f2)
    {
        //  Addition of fraction formula used in the cases below : a1b2 + a2b1 /b1b2
        this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
        this.denominator = this.denominator* f2.denominator;
        simplify();
    }
    public void multiply(Fraction f2)
    {
       this.numerator= this.numerator*f2.numerator;
       this.denominator = this.denominator*f2.denominator;
        simplify();
    }
}

