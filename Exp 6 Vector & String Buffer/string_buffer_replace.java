//NAME: Abdulrehman Choudhry
//BATCH: B1
//UIN: 231P099
//ROLLNO:5
//BRANCH: SE COMPS / div=A
public class string_buffer_replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original StringBuffer: " + sb);


        sb.replace(7, 12, "Java");

        System.out.println("StringBuffer after replace: " + sb);
    }
}
