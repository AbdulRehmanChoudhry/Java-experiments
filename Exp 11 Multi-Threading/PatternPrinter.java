//Aim:Write a program to print /*/*/*/*/* using two child thread.
/*Name:Abdul Rehman Choudhry
 * Class:SE-A
 * Uin: 231P099
 * Roll No. 5
 * */
package b1_05;

public class PatternPrinter {

    private static final Object lock = new Object();
    private static int turn = 0; // 0 for asterisk, 1 for slash

    public static void main(String[] args) {
        Thread asteriskThread = new Thread(new PrintAsterisk());
        Thread slashThread = new Thread(new PrintSlash());

        asteriskThread.start();
        slashThread.start();
    }

    static class PrintAsterisk implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (turn != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("*");
                    turn = 1; // Switch turn to slash thread
                    lock.notifyAll();
                }
            }
        }
    }

    static class PrintSlash implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (turn != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print("/");
                    turn = 0; // Switch turn to asterisk thread
                    lock.notifyAll();
                }
            }
        }
    }
}


