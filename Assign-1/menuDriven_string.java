//Abdul Rehman Choudhry
//231P099,05
/*Aim: Create a simple Java application that allows users to perform various
string manipulation operations.*/
import java.util.*;
class Strmethod{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a choice: 1:Reverse\n2:Pallindrome\n
 3:Vowel and consonant:\n4:Convert case\n5:Substring");
 int choice = sc.nextInt();
 sc.nextLine();
 switch(choice){
 case 1: System.out.println("Reverse the string");
 String s = new String();
 s = sc.nextLine();
 StringBuilder s1= new StringBuilder();
 s1.append(s);
 s1.reverse();
 System.out.println("Reversed string: "+s1);
 break;
 case 2:System.out.println("String pallindrome?");
 String h = new String();
 h = sc.nextLine();
 StringBuilder h1 = new StringBuilder(h);
 h1.reverse();
 if(h.equals(h1.toString())){
 System.out.println("Pallindrome string");
 }else{
 System.out.println("Not a palindrome string");
 }
 break;
 case 3:System.out.println("Vowel and consonant count");
 int v=0,c=0;
 String u = new String();
 u = sc.nextLine();
 u = u.toLowerCase();
 for(int i=0;i<u.length();i++){
 if(u.charAt(i)=='a'|| u.charAt(i)=='e' || u.charAt(i)=='i' || u.charAt(i)=='o' || u.charAt(i)=='u'){
 v++;
 }else if(u.charAt(i)>='a' && u.charAt(i)<='z'){
 c++;
 }
 }
 System.out.println("Number of vowels: "+v);
 System.out.println("Number of consonants: "+c);
 break;
 case 4:System.out.println("Convert to upper case and lower case");
 String p = new String();
 p = sc.nextLine();
 String p1=p.toLowerCase();
 String p2=p.toUpperCase();
 System.out.println("Lower case: "+p1);
 System.out.println("Upper case: "+p2);
 break;
 case 5:System.out.println("Substring check");
 String n = new String("Programming is easy");
 System.out.println("The extracted substring is:");
 System.out.println(n.substring(3));
 break;
 default:System.out.println("Wrong choice");}
 }
 }