package Step1;

import java.util.HashMap;
import java.util.Map;

public class String4 {

//	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String wholeString = "select season,winner,player_match from ipl.csv where season > 2014 and city ='Bangalore' or date > '31-12-2014'";
		 String[] split1=wholeString.split("");
		 
		String clue = "and,or,not";
		
		for(String s :wholeString.split(" ")){
			
			if (s.equals("and")||s.equals("or")||s.equals("not"))
			{
			System.out.println(s);
			}
			
		
		
	}
	
}
}