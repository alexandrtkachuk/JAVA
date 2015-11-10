class Me
{
    
    protected int temp;
    protected static int number;


    public void setTemp(int i)
    {
	this.temp = i;
    }

    public int getTemp()
    {
	return this.temp;
    }

    public int getNumber()
    {
	return this.number;
    }

    public void setNumber(int number)
    {
	this.number = number;
    }
}



class Test
{
    public static void main(String [] args)
    {
	Me temp1 = new Me();  
	Me temp2 = new Me();
	temp1.setTemp(44);
	temp2.setTemp(56);
	System.out.println(temp1.getTemp() );
	temp2.setNumber(99);
	System.out.println(temp1.getNumber() );
	System.out.println(temp2.getTemp() );
    }
}
