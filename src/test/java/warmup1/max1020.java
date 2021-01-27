package warmup1;

public class max1020 {

    /*

    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0
    if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11

     */

    public static int max1020(int a, int b) {

        if((a > 20 || a < 10) && ( b > 20 || b < 10 )) {    // first we rule out anything greater than 20 or less
            return 0;                                       // than 10 and return 0 if either a or b fall into that statment

        }else{
            if(a < b) {                                       // otherwise if a is less than b
                int temp = a;                               // we store a into a temporary variable called temp
                a = b;
                b = temp;
            }
            if(a >= 10 && a <= 20){
                return a;}
            else{return b;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(max1020(11,19));     // practice
    }
}
