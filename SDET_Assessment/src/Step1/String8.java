package Step1;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String t="select team1, sum(win_by_runs) from ipl.csv where season > 2016 and city= 'Bangalore' group by team1";
    
    
    
	String[] one =t.split("");
//	one = one[one.length_]
	char ch[]=t.toCharArray();

	for(int i=0;i<ch.length/2;i++)

	{

	char t1=ch[i];

	ch[i]=ch[ch.length-1-i];

	ch[ch.length-1-i]=t1;

	}

	String t2=new String(ch);

	System.out.println(t2);
	
	
	}

}
