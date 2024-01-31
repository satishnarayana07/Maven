package Program;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Count_String {

	public static void main(String[] args) throws Exception {
		
		String str;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string");
		str=br.readLine();
		
		//str="SaiBaba True God";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}

System.out.println("Total number of characters in string:"+count);

}
}