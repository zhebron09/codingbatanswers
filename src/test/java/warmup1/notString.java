package warmup1;

public class notString {

    /*

    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"

     */

        public static String notString(String str) {

            if(str.startsWith("not"))       // if str starts with "not" (here we are using a helper method. We can also use substring here)
                return str;                 // return as is
            return "not " + str;            // else wise return "not" plus(concat) the original string
        }

    public static void main(String[] args) {
        System.out.println(notString("candy"));
    }       // practice
}

