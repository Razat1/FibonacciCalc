//package FibonacciCalc;

import java.math.BigInteger;

public class FibonacciSeq {
    public static void main(String[] args) {
        //defined how big sequence is in variable
        int numbers = 100;
        //for loop created to increase numbers from 1 to end number
        for (int i = 0; i <= numbers; i++) {
            //result is stored in 'biginteger' datatype of fibonacci sequence created below
            BigInteger result = fibonacciNum(i);
            //prints result
            System.out.println("The result for " + i + " is = " + result);
        }
    }

    public static BigInteger fibonacciNum(int num) {
        if (num == 0) {
            return BigInteger.valueOf(0);
        } else if (num == 1) {
            return BigInteger.valueOf(1);
        }

        //method created for fibonacci sequence to initialise

        //first and second numbers defined
        BigInteger first = BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        //for loop created and i initialised at 2 as first and second are defined above
        for (int i = 2; i <= num; i++) {
            //when i = 2, the 2nd fibonacci number is calculated and update second variable
            //when i = 3, the 3rd is calculated and updated second var again until end of sequence
            BigInteger next = first.add(second);
            first = second;
            second = next;

        }
        return second;
    }
}



