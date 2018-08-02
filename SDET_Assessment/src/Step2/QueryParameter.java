package Step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class QueryParameter {
	
	

	
	private static String queryString;
	private static String file;
	private static String baseQuery;
	private static List<Restrictions> restrictions;
	private static List<String> fields;
	private static String Query_type;
	private static List<String> logicalOperators;
	private static List<AggregateFunctions> aggregateFunctions;
	private static List<String> orderByfield;
	private static List<String> groupByfield;
	private static String aggregatefields;
	
	
	public void setqueryString(String wholeString ){
	
		this.queryString = wholeString;
		
	}
	
	public String getqueryString(){
		System.out.println("queryString is " + queryString);
		return queryString;
	}
	
	
	public void setFile(){
		
		
		List<String> myList = new ArrayList<String>(Arrays.asList(queryString.split(" ")));
		
		this.file = myList.get(3);
		
	}
	
	public String getFile(){
		return file;
		
	}
	
	
	
	
	
	

	

}
