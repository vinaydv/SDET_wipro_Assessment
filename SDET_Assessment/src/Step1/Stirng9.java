package Step1;

public class Stirng9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "select avg(win_by_wickets),min(win_by_runs) from ipl.csv ";
		String result = "";
			result =      text.substring(
			        text.indexOf("select") + "select".length(),
			        text.length());
			result =
				      result.substring(
				        0,
				        result.indexOf("from"));
		for(String s: result.split(",")){
			System.out.println(s);
		} 
	}

}
