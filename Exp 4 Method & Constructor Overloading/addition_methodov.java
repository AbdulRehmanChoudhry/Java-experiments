package self_learning;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div:A
 * UIN: 231P099
 * Roll No. 05*/
public class addition_methodov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrInt obj = new StrInt();
		int sum = obj.add(10, 20);
		System.out.println("Sum of integers: " + sum); 
		String concatenatedString = obj.add("Abdul ", "Rehman");
		System.out.println("Concatenated String: " + concatenatedString);
	}

}
class StrInt
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
		
	public String add(String a, String b) 
	{
		return a + b;
	}
}
