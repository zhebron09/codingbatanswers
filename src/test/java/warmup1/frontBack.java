package warmup1;

public class frontBack {

    /*

    Given a string, return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"

     */

    public static String frontBack(String str) {

        if(str.length() < 2){                             // if str.length is less than 2

            return str;                                   // return str(you can't switch chars between less than 2 chars)

        }  return str.substring(str.length()-1) +         // otherwise if over 2 chars, return the str starting at length-1(
                    str.substring(1, str.length() - 1) +  // which is the last char plus substring starting at index 1 and up
                    str.substring(0,1);                   // till the last char plus the first char substring(0,1)
    }



    public static void main(String[] args) {

        System.out.println(frontBack("code"));         // practice :)
    }
}

