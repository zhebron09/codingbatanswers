package warmup1;

public class mixStart {

    /*

    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false

     */

    public static boolean mixStart(String str) {

        return(str.length() >= 3 && str.substring(1,3).equals("ix"));   // return true is the length of str is greater than or equal to 3 AND
                                                                        // substring of str index (1,3) equals "ix" (this way any char can be in index 0)
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }   // practice :)
}
