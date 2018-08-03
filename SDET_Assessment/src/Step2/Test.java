package Step2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String wholeString = "select * from ipl.csv where season > 2014 and city = 'Bangalore'";
		 
		 
		 QueryParser Qp = new QueryParser();
		 
		 
		 
		 Qp.parseQuery(wholeString);
		 
		 
		 System.out.println(Qp.getFile());
		 System.out.println(Qp.getbasequery());
	}

}
