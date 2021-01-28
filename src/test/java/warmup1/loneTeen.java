package warmup1;

public class loneTeen {

    /*

    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false

     */

    public static boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);           // if a greater than or equal to 13 AND a is less than and equal to 19 aTeen is true

        boolean bTeen = (b >= 13 && b <= 19);           // if b greater than or equal to 13 AND b is less than and equal to 19 bTeen is true

        return(aTeen && !bTeen) || (!aTeen && bTeen);   // return true is aTeen is true AND bTeen is not true OR is aTeen is not true AND bTeen is true
    }

    public static void main(String[] args) {
        System.out.println(loneTeen(13,99));
    }       // practice :)
}
