public class Bowlarama
{
public static void main(String[] args)
{
	
	String name = null;
	double game1 =0 ,game2 = 0,game3 = 0;
	double tpins = 0;
	double tteampin =0;
	char yn = 'n';
	double ave = 0;
	
	
	while ( yn == 'n' )
	{
		
		System.out.println("\n What is the name? ");
		 name = SavitchIn.readLine();
		 
		    System.out.println("\n What is the score for game one?");
		    game1 = SavitchIn.readLineDouble();
		 
		        System.out.println("\n What is the score for game two?");
		        game2 = SavitchIn.readLineDouble();
		
		            System.out.println("\n What is the score for game three?");
		            game3 = SavitchIn.readLineDouble();
		
		              tpins = game1 + game2 + game3;
		              ave = tpins / 3;
		              tteampin += tpins;
		                  
		  	System.out.println("\n\n Name      Game 1  Game 2   Game 3  Total Pins Average  ");
System.out.println("\n\n "+ name + "    "  + game1  +   "    " + game2  + "    " + game3  + "    " +  tpins + "   "    +   ave);


		  
		  System.out.println("\n\n Do you want to quit?  y/n");
                          yn = SavitchIn.readChar();
	      
                            SavitchIn.readLine();
							
		
	}
	
      System.out.println("\n\n Team Pin Totals: " + tteampin);

}


}