package Step1;

public class Strings7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "select * from ipl.csv where season > 2016 and city= 'Bangalore' order by win_by_runs".trim();		
		
			
			String lastWord = s.substring(s.lastIndexOf(" ")+1);
			System.out.println(lastWord);
			
		
		}

	}


