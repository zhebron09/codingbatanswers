package warmup1;

public class or35 {

    /*

    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.

    or35(3) → true
    or35(10) → true
    or35(8) → false

    */

    public static boolean or35(int n) {

        return (n % 3 == 0 || n % 5 == 0);      // if n mod 3 equals 0 OR n mod 5 equals 0 return true (want to know if the number
    }                                           // is divisible by itself evenly. For Example: 3 for into 3 evenly...but 3 goes into
                                                // 5 with 2 remaining...3 one time then 2 remaining equals 5...3 goes into 6 twice evenly
                                                // with no remainder. 3 plus 3 equals 6 with no remaining ints to account for

    // BONUS method ( practice modular with this )

    public static int modPrac(int n){
        return n % 10;
    }


    public static void main(String[] args) {
        System.out.println(or35(10));

        System.out.println(modPrac(105));    // practice using mod here :)
    }
}
