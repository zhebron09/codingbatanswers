package warmup1;

public class lastDigit {

    /*

    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that
    the % "mod" operator computes remainders, so 17 % 10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true

     */

    public static boolean lastDigit(int a, int b) {

        return(a%10 == b%10);   // here we are saying if we see how many times a or b is divisble by 10 no matter the number
                                // we get a single digit...so we want to return true if the modular versions of each other equal one another
    }


    // BONUS method ( practice modular with this )

    public static int modPrac(int n){
        return n % 10;
    }



    public static void main(String[] args) {

        System.out.println(lastDigit(7,17));      // practice :)

        System.out.println(modPrac(105));    // practice using mod here :)
    }
}


