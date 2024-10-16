//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO: 5
//BRANCH: SE COMPS / DIV=A
public class pattern_star {

    public static void main(String args[]) {
        stop:
        { nextRow:
        for(int row=1;row<=7;row++) {
            if (row==6)
                break stop;
            System.out.println();
            for(int column=1;column<=10;column++)
            {
                if(column>row)
                    continue nextRow;
                System.out.print(" * ");
            }
        }  } }}