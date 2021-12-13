import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        // obj declarations
        PrintStream p = System.out;
        Scanner in = new Scanner(System.in);
        fibonacci nacc = new fibonacci();

        // var declarations
        int n;
        BigInteger answer;
        long time, newTime;

        p.println("Welcome to fibonacci number generator" + "\n");

            p.println("Enter a positive integer");
            //store int to calculate fib as n
            n = in.nextInt();

            // start stopwatch
            time = System.currentTimeMillis();
            //store fibonacci of n as answer var
            answer = nacc.fib(n);
            // stop stopwatch
            newTime = System.currentTimeMillis();

            // display answer and time it took to compute
            p.println("the " + "number " +  n + " fibonacci number is " + answer + "\n");
            p.println("It took: " + (newTime - time) + " Milliseconds");
    }
}
