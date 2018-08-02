package Step2;

public class AggregateFunctions {

	private static String field;
	private static int result;
	private static String function;
	private static int aggregateFieldIndex;
	
	
	public void setfield(String field){
		this.field = field;
		
	}
	public void setresult(int result){
		this.result = result;
		
	}
	public void setfunction(String function){
		this.function = function;
		
	}
	public void setAggregatefieldIndex(int aggregateFieldIndex){
		this.aggregateFieldIndex = aggregateFieldIndex;
		
	}
	

	public String getfield(){
		return field;
	}
	
	
	public int getresult(){
		return result;
	}
	
	public String getFunction(){
		return function;
	}
	
	public int getAggregateFieldIndex(){
		return aggregateFieldIndex;
	}
}
