package epam.CLEAN_CODE;

public class Calculate_interest {
	
	public double si(double principle,double time,double rate)
	{
		double amt=(double)((principle*time*rate)/100);
		
		return amt+principle;
	}
	public double ci(double principle,double time,double rate)
	{
		double amt=(double)(principle*(Math.pow((1+(rate/100)), time)));
		amt=amt-principle;
		return amt;
	}

}
