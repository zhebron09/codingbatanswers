package warmup1;

public class startHi {

    /*

    Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false

     */

    public static boolean startHi(String str) {

        if(str.length() < 2)                        // if length of str is less than 2
            return false;                           // return false(since hi takes 2 indexes it's not possible)
        return(str.substring(0,2).equals("hi"));    // otherwise if substring of str at index 0 to 2 equals "hi" return true
    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));    // practice :)
    }
}
