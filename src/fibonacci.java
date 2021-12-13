
import java.math.*;

public class fibonacci {
    // var declarations
    BigInteger answer;

    // obj declarations
    //static, final, and BigInteger to optimize for fastest compute time
    private static final BigInteger[] answers = new BigInteger[10000];

    BigInteger fib(int n){

        // set index 1 as 1
        answers[1] = BigInteger.ONE;

        // base case
        if(n == 1 || n == 2){
            answer = BigInteger.ONE;
            return answer;
        }else if(answers[n] != null){   // if answer is already computed use it instead of computing again
            answer = answers[n];
            return answer;
        }else if(answers[n - 1] != null && answers[n - 2] != null){ // if answer before n and 2 before n is computed
            answer = (answers[n-1].add(answers[n-2]));              //compute with those values to skip first 2 computations
            answers[n] = answer;
            return answer;
        }else{
            answer = fib(n-1).add(fib(n-2));    // classic recursive fibonacci sequence
            answers[n] = answer;    // store answer in array so it won't need to be computed again
            return answer;
        }
    }
}

