
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public final int num;
    public final int den;
    static Fraction zero = new Fraction();
    static Fraction un = new Fraction(1, 1);

    /**
     * Constructeur d'objets de classe Fraction
     */
    public Fraction(int a, int b)
    {
        this.num = a;
        this.den = b;
    }

    public Fraction(int a)
    {
        this.num = a;
        this.den = 1;
    }
    
    public Fraction()
    {
        this.num = 0;
        this.den = 1;
    }
     public int getnum()
    { 
         return num; 
    }
    public int getden()
    {
        return den; 
    }
    public double getvaleur(){ 
        double r ;
        r = ( num /  den); 
        return r;
    }
    public Fraction add(Fraction f1)
    {
        Fraction f2 =  new Fraction(this.num * f1.den + num * f1.num, this.den * f1.den);
        return f2;
    }
    public boolean equals(Object o)
    {
        double a1 , a2;
        a1 = (this.num / this.den);
        a2 = ((((Fraction) o).num)/ ((Fraction) o).den);
        if (a1 == a2)
        {return true;}
        else {return false;}
    }
    @Override
    public String toString()
    {
        return (this.num + "/" + this.den ) ;
    }
    public String compare(Fraction f)
    {
     if(this.num * f.den == f.num * this.den)
     {return (this.toString() + " = " + f.toString());}
     if(this.num * f.den < f.num * this.den)
     {return (this.toString() + " < " + f.toString());}
     else
     {return (this.toString() + " > " + f.toString());}
    }
}
