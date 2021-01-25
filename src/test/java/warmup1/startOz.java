package warmup1;

public class startOz {

    /*

    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
    and include the second only if it is 'z', so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"

     */

    public static String startOz(String str) {

        String result = "";                             // create empty String variable

        if(str.length() >= 1 && str.charAt(0) == 'o') {  // if length of str is greater than or equal to 1 AND char at index 0 is 'o'
            result = result + str.charAt(0); }          // result equals result(empty)

        if(str.length() >= 2 && str.charAt(1) == 'z') {  // if length of str is greater than or equal to 2 AND char at index 1 equals 'z'
            result = result + str.charAt(1);             // result( which is now 'o' if char at index 0 is 'o' from previous if statement)
                                                         // equals result plus char at index 1, here we are updating result variable conditions again
        }
        return result;                                    // return the result after being updated from both if statements
    }


    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));      // practice :)
    }
}