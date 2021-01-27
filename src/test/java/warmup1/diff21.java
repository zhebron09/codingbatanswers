package warmup1;

public class diff21 {

    /*

    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0

     */

    public static int diff21(int n) {

        if(n <= 21) {                      // if n is less than or equal to 21

            return 21 - n;                // return 21 - the value of n

        } else {

            return (n - 21) *2;          // if not then return the value of n - 21 multiplied by 2
        }
    }

    public static void main(String[] args) {
        System.out.println(diff21(10));
    }       // practice :)
}

