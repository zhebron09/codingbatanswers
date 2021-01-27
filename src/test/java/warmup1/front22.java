package warmup1;

public class front22 {

    /*

    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"

     */

    public static String front22(String str) {

        String front = "";                      // create new String variable with empty String

        if(str.length()<2)                      // if length of the str is under 2

        {front = str;}                          // then front equals the original str value

        else{front = str.substring(0,2);        // otherwise is str length is greater than 2 then front = substring(0,2)
        }

        return front + str + front;               // return front concat str concat front
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
    }
}
