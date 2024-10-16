package b1_05;
/*Name:Abdul Rehman Choudhry
 * Class:SE-A
 * Uin: 231P099
 * Roll No. 5
 * */
class Student
{
int rollNumber;
void getNumber(int n)
{
rollNumber=n;
}
void printNumber()
{
System.out.println("RollNo is " +rollNumber);
}
}
class Test extends Student
{
float part1,part2;
void getMarks(float a, float b)
{
part1=a;
part2=b;
} void putMarks()
{
System.out.println("Marks Part1 "+part1);
System.out.println("Marks Part2 "+part2);
}
}
interface Sports
{
float sportwt=6.0F;
void putwt();
}
class Results extends Test implements Sports
{
float total;
public void putwt()
{
System.out.println("Sports Marks "+ sportwt);
}
void display()
{
total=part1+part2+sportwt;
System.out.println("Total marks of " +rollNumber+" is "+total);
}
}
public class stud_result_inheritance {

	public static void main(String[] args) {
		Results a=new Results();
		a.getNumber(05);
		a.printNumber();
		a.getMarks(10.0F,25.5F);
		a.putMarks();
		a.putwt();
		a.display();

	}

}
