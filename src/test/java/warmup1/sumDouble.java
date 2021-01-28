package warmup1;

public class sumDouble {

    /*

    Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8

     */

    public static int sumDouble(int a, int b) {

        int sum = a + b;        // stored the product of a + b into int variable sum

        if(a != b)              // if a is not equal to b

            return sum;         // return sum as is

        return  2 * sum;        // otherwise return the sum * 2
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(3,2));     // practice
    }
}
