// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber()
  {
    num=0;
    denom=1;
  }
  public int GreatestCommonDivisor(int first, int second)
  {
    int temp;
    while (second != 0) 
    {
        temp = second;
        second = first % second;
        first = temp;
    }        
    return first;
}   
  public RationalNumber(int numerator, int denominator)
  {
    num=numerator;
    denom=denominator;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
  public String toString()
  {
    String s;
    if (denom==1)
    {
     s=""+num;
    }
    else
    {
      s=num/GreatestCommonDivisor(num,denom)+"/"+denom/GreatestCommonDivisor(num,denom);
    }
    return s;
  }
  public void add(RationalNumber frac)
  {
    int d2=frac.getDenominator();
    int n2=frac.getNumerator();
    num=(num*d2)+(n2*denom);
    denom=denom*d2;
    //denom=denom/GreatestCommonDivisor(num,denom);
    //num=num/GreatestCommonDivisor(num,denom);
  }
  public void subtract(RationalNumber frac)
  {
    int n2=frac.getNumerator();
    int d2=frac.getDenominator();
    num=(num*d2)-(n2*denom);
    denom=denom*d2;
    
  }
  public void multiply(RationalNumber frac)
  {
    int n2=frac.getNumerator();
    int d2=frac.getDenominator();
    denom=denom*d2;
    num=num*n2;
  }
  public void divide(RationalNumber frac)
  {
    int n2=frac.getNumerator();
    int d2=frac.getDenominator();
    num=num*d2;
    denom=denom*n2;
  }
}
      
    
