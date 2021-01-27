package warmup1;

public class endUp {

    /*

    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
    uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"

    */

    public static String endUp(String str) {

        if (str.length() >= 3) {                                    // if the length of string is greater than or equal to 3 return from 0 to the
            return str.substring(0, str.length() - 3) +             // 3rd to last char(-3) plus substring starting at 3rd to last char(-3) which
                    str.substring(str.length() - 3).toUpperCase();  // which will give the last 3 chars then convert to uppercase

        } else {                                                    // otherwise is length is not greater than or equal to 3

            return (str.toUpperCase());                             // return the str as is converted to uppercase

        }
    }


    public static void main(String[] args) {

        System.out.println(endUp("Hello"));
    }
}

