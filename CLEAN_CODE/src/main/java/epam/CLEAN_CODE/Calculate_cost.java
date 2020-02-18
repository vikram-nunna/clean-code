package epam.CLEAN_CODE;

public class Calculate_cost{
	double calcost(int std,double area,boolean automated)
	{
		double amt=0;
	
		if(std==1) {
			amt=amt+(1200*area);
		}
		
		else if(std==2){
			amt=amt+(1500*area);
		}
		
		else if(std==3 && !automated){
			amt=amt+(1800*area);
		}
		
		else{
			amt=amt+(2500*area);
		}		
		return amt;	
	}
}
