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
    denom=denom*frac.getDenominator();
    num=(num*frac.getDenominator())+(frac.getNumerator()*denom);
    denom=denom/GreatestCommonDivisor(num,denom);
    num=num/GreatestCommonDivisor(num,denom);
  }
  public void subtract(RationalNumber frac)
  {
    denom=denom*frac.getDenominator();
    num=(num*frac.getDenominator())-(frac.getNumerator()*denom);
    denom=denom/GreatestCommonDivisor(num,denom);
    num=num/GreatestCommonDivisor(num,denom);
  }
  public void multiply(RationalNumber frac)
  {
    denom=denom*frac.getDenominator();
    num=num*frac.getNumerator();
    denom=denom/GreatestCommonDivisor(num,denom);
    num=num/GreatestCommonDivisor(num,denom);
  }
  public void divide(RationalNumber frac)
  {
    num=num*frac.getDenominator();
    denom=denom*frac.getNumerator();
    denom=denom/GreatestCommonDivisor(num,denom);
    num=num/GreatestCommonDivisor(num,denom);
  }
}
      
    
