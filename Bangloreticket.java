package basics;

public class Bangloreticket
{
	public static void main(String[] args)
	{
		int age=45;
		char gender='m';
	
		
		if(gender=='f')
		{
			System.out.println("female free travel");
			
		}//end of IF
		else// male 
		{// else begin
			if(age<2)
			{
				System.out.println("free ticket");
			}//kids boys
			else if((age>=2) && (age<=12))
			{
				System.out.println(" young half ticket");
			}
			else if ((age>12)&&(age<=60))
			{
				System.out.println(" male full ticket");	
			}
				else if(age>60)
				{
					
					System.out.println(" senior half ticket");
			}
	    }//end of else
	}

}
