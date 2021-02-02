package logic2;

/*

For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15
rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12
rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a
separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same
indent level as roundSum().

roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10

 */

public class roundSum {

    public static int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);

        return a + b + c;
    }

    public static int round10(int num) {
        int diff = num % 10;

        if(num < 4){
            num = 0;
        }
        else if (diff >= 5) {
            num = (10 - diff) + num;
        }
        else if(diff < 5){
            num = diff + (10-diff);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(roundSum(12,19,21));
    }
}
