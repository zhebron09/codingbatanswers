package warmup1;

public class close10 {

    /*

    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0

     */

    public static int close10(int a, int b) {

        // Math.abs() - this takes the absolute value of a number meaning -2 is 2 and 4 is 4

        int aDiff = Math.abs(10-a);     // assigning the absolute difference of 10 - a to a variable
        int bDiff = Math.abs(10-b);     // assigning the absolute difference of 10 - b to a variable

        if(aDiff < bDiff) {             // we are saying here that is aDiff is smaller than bDiff then the answer is a b.c.
                                        // the higher the number the farther away from 10 it is and a is closer to 10
            return a;
        }
        if(aDiff > bDiff) {             // here we are repeating the statement but saying if aDiff is larger than b must be closer to 10
            return b;
        }
        else {return 0;}               // here we are saying if neither aDiff is smaller or larger(the only solution left is that it must
                                        // be equal then we must return 0
    }

    public static void main(String[] args) {

        System.out.println(close10(8,13));           // practice :)
    }
}

