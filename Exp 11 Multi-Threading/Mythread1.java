//Aim:Write a program to display the string in main thread and child thread
/*Name:Abdul Rehman Choudhry
 * Class:SE-A
 * Uin: 231P099
 * Roll No. 5
 * */
package b1_05;
public class Mythread1 extends Thread //inheriting the properties of thread
{
public static void main(String args[])// main method

{
Mythread1 ex=new Mythread1();//creating object of main class
ex.create(); // creating main thread
System.out.println("this is the main thread!");//displaying string
}
public void create()// creating another thread
{

Thread t=new Thread(this); // creating object of Thread class

t.start(); //starting a thread
}
public void run()// running a thread
{
while(true) //while terminate
{
try
{

System.out.println("this is the child thread!");//displaying string
Thread.sleep(500); // sleep for 500 ms
}
catch (InterruptedException e) { }
}

}

}
