package b1_05;
/*Name:Abdul Rehman Choudhry
 * Class:SE-A
 * Uin: 231P099
 * Roll No. 5
 * */
import java.util.Scanner;


interface Matrix1 {
 final static int M = 5, N = 5;

 void readMatrix();
 void displayMatrix();
 void sum_Diagonal_Matrix();
}


class MatrixImplementation1 implements Matrix1 {
 int[][] matrix = new int[M][N];


 public void readMatrix() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements for a " + M + "x" + N + " matrix:");
     for (int i = 0; i < M; i++) {
         for (int j = 0; j < N; j++) {
             matrix[i][j] = sc.nextInt();
         }
     }
 }


 public void displayMatrix() {
     System.out.println("Matrix:");
     for (int i = 0; i < M; i++) {
         for (int j = 0; j < N; j++) {
             System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }
 }


 public void sum_Diagonal_Matrix() {
     int sum = 0;
     for (int i = 0; i < M; i++) {
         sum += matrix[i][i];
     }
     System.out.println("Sum of diagonal elements: " + sum);
 }
}

public class inher_mat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MatrixImplementation1 matrix = new MatrixImplementation1();


	        matrix.readMatrix();


	        matrix.displayMatrix();

	        matrix.sum_Diagonal_Matrix();
	}

}
