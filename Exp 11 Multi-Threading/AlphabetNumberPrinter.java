//Aim:Write a program to print alphabets and numbers using two threads.
/*Name:Abdul Rehman Choudhry
 * Class:SE-A
 * Uin: 231P099
 * Roll No. 5
 * */

package b1_05;

public class AlphabetNumberPrinter {

    public static void main(String[] args) {
        Thread alphabetThread = new Thread(new PrintAlphabets());
        Thread numberThread = new Thread(new PrintNumbers());

        alphabetThread.start();
        numberThread.start();
    }

    static class PrintAlphabets implements Runnable {
        @Override
        public void run() {
            for (char ch = 'A'; ch <= 'K'; ch++) {
                System.out.print(ch + " ");
                try {
                    Thread.sleep(100); // Small delay for visibility
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class PrintNumbers implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <= 9; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(100); // Small delay for visibility
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
