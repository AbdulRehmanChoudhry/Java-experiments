//NAME: Abdul Rehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 05
//BRANCH: SE COMPS / DIV=A
import java.util.*;
public class frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = new String();

        char ch ='a';
        int len,count=0;

        System.out.println("Enter String ");
        str = sc.nextLine();

        System.out.println("Enter a character to be searched ");
        ch = sc.next().charAt(0);
        System.out.println("String is "+str);
        len = str.length();

        for(int i=0;i<=len-1;i++)
            if(ch==str.charAt(i))
                count++;
        System.out.println("Frequency of character '"+ch+"' in string is "+count);
        sc.close();
    }
}
