package skl_oop;
/*
 * Name: Abdul Rehman Choudhry
 * Class: FE
 * Div: A
 * Roll No: 05
 * Uin: 231P099*/
import java.util.Scanner;

public class matrix_diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i , j;
		int add[][]= new int[3][3];
		int set1[ ][ ] = new int[3][3];
		int set2[ ][ ] = new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first 3X3 matrix is :\n");
		for (i=0 ; i<3 ; i++)
		{
		for (j=0 ; j<3 ; j++)
		set1[i][j]=input.nextInt();
		}
		System.out.print("Enter second 3X3 matrix is :\n");
		for (i=0 ; i<3 ; i++)
		{
		for (j=0 ; j<3 ; j++)
		set2[i][j]=input.nextInt();
		
		}
		for (i=0 ; i<3 ; i++)
		{
		for (j=0 ; j<3 ; j++)
		add[i][j] = set1[i][j] + set2[i][j] ;
		}
		
		System.out.println("The first 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
		for (j=0 ; j<3 ; j++)
		System.out.print(set1[i][j]+"\t");
		System.out.println(" ");
		}

		System.out.println("The second 3X3 matrix is : ");
		for (i=0 ; i<3 ; i++)
		{
		for (j=0 ; j<3 ; j++)
		System.out.print(set2[i][j]+"\t");
		System.out.println(" ");
		}

		System.out.println(" ");
		
		System.out.println("The resultant addition 3X3 matrix is :") ;
		for (i=0 ; i<3 ; i++)
		{
		for (j=i ; j<=i ; j++) 
		System.out.print(add[i][j]+"\t");
		System.out.println(" ");
		
		}
	}

}
