package program;

public class Animal {

	public void dog() {
		System.out.println(" dog is barking");
	}
	
}

class Birds{
	
	public void penguin() {
		
		System.out.println("penguns are lived in Antarcitica");
	}
}
	
class Test{
public static void main(String[] args) {
		
	Animal a=new Animal();
	a.dog();
	Birds b=new Birds();
	b.penguin();
		

	} }


