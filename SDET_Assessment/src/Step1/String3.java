package Step1;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String wholeString = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		   
		    String[] clue = wholeString.split("where");
				
			String[] subclue = clue[1].split("and");
			System.out.println(subclue[0]);
			System.out.println(subclue[1]);
			
			
			
			


	}

}
