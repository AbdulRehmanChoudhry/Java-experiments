//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO:5
//BRANCH: SE COMPS / div=A
import java.util.*;
public class shopping_vector {
    public static void main(String args[])
    {
        Vector list = new Vector();
        int len=args.length;
        for(int i=0;i<len;i++)
        {
            list.addElement(args[i]);
        }
        int size=list.size();
        String str[]= new String[size];
        list.copyInto(str);
        for(int i=0;i<size;i++)
        {
            System.out.println ("Element of Vector at position "+i+":"+str[i]);
        }
    }
}
