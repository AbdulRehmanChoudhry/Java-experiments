//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 5
//BRANCH: SE COMPS / DIV=A

import java.util.*;
class account
{
    String cust_name;
    int acc_no;
    account(String a, int b)
    {
        cust_name=a;
        acc_no=b;
    }
    void display()
    {
        System.out.println ("Customer Name: "+cust_name);
        System.out.println ("Account No: "+acc_no);
    }
}
class Online extends account
{
    Online(String a, int b)
    { super(a,b); }
    void display()
    {
        System.out.println ("Customer-Id: "+(cust_name+acc_no%10));
        System.out.println ("Customer Password: "+(acc_no/10+8));
    }
}
class Saving_Acc extends account
{
    int min_bal,saving_bal;
    Saving_Acc(String a, int b, int c, int d)
    {
        super(a,b);
        min_bal=c;
        saving_bal=d;
    }
    void display()
    {
        super.display();
        System.out.println ("Minimum Balance: "+min_bal);
        System.out.println ("Saving Balance: "+saving_bal);
    }
}
class Acct_Details extends Saving_Acc
{
    int deposits, withdrawals;
    Acct_Details(String a, int b, int c, int d, int e, int f)
    {    super(a,b,c,d);
        deposits=e;
        withdrawals=f;  }
    void display()
    {  super.display();
        System.out.println ("Deposit: "+deposits);
        System.out.println ("Withdrawals: "+withdrawals);
    }   }


public class exp7_1
{   public static void main(String args[])
{
    Acct_Details A = new Acct_Details("Pa.one",666,1000,5000,500,9000);
    Online ol=new Online("Pa.one",666);
    A.display();
    ol.display();
}   }