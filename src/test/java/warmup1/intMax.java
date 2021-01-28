package warmup1;

public class intMax {

    /*

    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3

     */

    public static int intMax(int a, int b, int c) {

        if( a > b && a > c ){       // if a is greater than b AND a is greater than c
            return a;               // return a
        }
        else if( b > a && b > c) {  // else if b is greater than a AND b is greater than c
            return b;               // return b
        }
        else {return c;}            // other wise since the only scenario left is c we can say
    }                               // if the 1st and 2nd if statements aren't true then return c


    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));      // practice :)
    }
}
