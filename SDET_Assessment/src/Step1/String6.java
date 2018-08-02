package Step1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wholeString = "select city,winner,player_match from ipl.csv where season > 2014 and city = 'Bangalore'";
		 
			    // specify that we want to search for two groups in the string
			    Pattern p = Pattern.compile(" (\\S+it\\S+) ");
			    Matcher m = p.matcher(wholeString);

			    // if our pattern matches the string, we can try to extract our groups
			    if (m.find())
			    {
			      // get the group id we were looking for
			      String group1 = m.group(1);
			   
			      for(String s : group1.split(","))
			      // print the groups, with a wee bit of formatting
			      System.out.format("%s \n", s); 
			      
			    }

			  }
	
	
	}


