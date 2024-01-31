package program;

public class Count_String {

	public static void main(String[] args) {
		
		String str="SaiBaba True God";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}

System.out.println("Total number of characters in string:"+count);

}
}