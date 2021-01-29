package warmup1;

public class posNeg {

    /*

    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
    then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true

     */

    public static boolean posNeg(int a, int b, boolean negative) {

        if(negative) {                                      // if negative is true
            return (a < 0 && b < 0);                        // return true if a less than 0 AND b < 0 (meaning negative ints)
        }  {
            return (a < 0 && b >= 0 || a >= 0 && b < 0);    // otherwise reutn false if a is less than 0 AND b is greater than or equal to 0
        }                                                   // OR a is greater than or equal to 0 AND b is less than 0 ( if only a or b is negative)
    }

    public static void main(String[] args) {
        System.out.println(posNeg(1,-1,false));
    }       // practice :)
}


