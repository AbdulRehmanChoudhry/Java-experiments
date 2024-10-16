package self_learning;
/*
 * Name: Abdul Rehman Choudhry
 * Class: SE
 * Div:A
 * UIN: 231P099
 * Roll No. 05*/
class GCD
{
	int number1;
	int number2;
   	int gcd;
    
   	{
        this.number1 = 12; 
        this.number2 = 17;   
    }
	
    public void GCD() 
    {
        int a = number1;
        int b = number2;
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a; 
    }

  
    public void display() 
    {
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
public class Eulcidalgo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD obj = new GCD();
        obj.GCD();
        obj.display();

	}

}
