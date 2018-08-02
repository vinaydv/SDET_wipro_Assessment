package Step1;

import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Query = "select * from ipl.csv where season > 2014 and city = 'Bangalore'"; 
		StringTokenizer t = new StringTokenizer(Query);
		String word1 ="";
		String output = "ipl.csv";
		while(t.hasMoreTokens())
		{
		    word1 = t.nextToken();
		    if(word1.equals(output))
		    	    System.out.println(word1);
		 //   break;
		    
		}



	}

}
