//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO:5
//BRANCH: SE COMPS / div=A
import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        String str, rev;

        StringBuffer str1 = new StringBuffer();

        Scanner sc= new Scanner(System.in);
        System.out.print ("Enter a String :");
        str=sc.nextLine();
        str1.append(str);
        str1.reverse();
        rev=str1.toString();
        if(str.equalsIgnoreCase(rev))
            System.out.println ("\n The enter string is Palindrome");
        else
            System.out.println (" \n Not a Palindrome");
    }
}
