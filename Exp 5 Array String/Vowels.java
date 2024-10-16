package SKL_JAVA_B1;
/*Name: Abdul Rehman Choudhry
 * UIN: 231P099
 * Roll No.5
 * Class: SE-A*/
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len,count=0;
		String str2 = new String();
		System.out.println("Enter a string:");
		str2=sc.nextLine();
		len = str2.length();
        for(int i=0;i<=len-1;i++) 
        {
        	if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u'||str2.charAt(i)=='A'||str2.charAt(i)=='E'||str2.charAt(i)=='I'||str2.charAt(i)=='O'||str2.charAt(i)=='U')
        		count ++;
        	
        }
        System.out.println("The total Number of vowels in the string "+str2+" is:"+count);
	}

}