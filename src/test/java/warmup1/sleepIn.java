package warmup1;

public class sleepIn {

    /*

    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true

     */

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {     // here we are saying if it's not a weekday or we are on vacation
            return true;                // return true
        } else {
            return false;               // other wise if it is a weekday or we are not on vacation return false
        }
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));       // practice
    }
}
