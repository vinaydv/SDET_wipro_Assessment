package Step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String wholeString = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		   
		    
			
			List<String> myList = new ArrayList<String>(Arrays.asList(wholeString.split(" ")));
			System.out.println(myList.get(3)); 
			
			
		}

	}


