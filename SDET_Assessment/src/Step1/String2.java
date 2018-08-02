package Step1;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	String wholeString = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		   
		    String[] clue = wholeString.split("where");
			System.out.println("Base section output is " + clue[0].trim());

	}

}
