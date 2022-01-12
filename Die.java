public class Die
{
private int value;
private int numSides;
private static int id; //like a counter shared between classes
private int dieId;



public Die(int v, int n)
{
setValue(v);
setNumSides(n);
id++;
setDieId(id);
}

public Die()
{
  this(1,6);
}

public int getValue()
{
  return value;
}
public int getNumSides()
{
  return numSides;
}

public void setValue(int v)
{
  value=v;
}
public void setNumSides(int n)
{
  numSides=n;
}

public void setDieId(int id)
{
  dieId = id;
}

public int getDieId()
{
  return dieId;
}

public int roll()
{
  int value = (1+((int)(numSides*Math.random())));
this.setValue(value);
  return (1+((int)(numSides*Math.random())));
}

public boolean equals (Die d)
{
  if(this.getValue() == d.getValue())
  {
    return true;
  }
  else
  {
    return false;
  }
}

public String toString()
{
  return "Value: "+value+"\nNumSides: "+numSides+ "\ndie Id " + dieId;
}
}