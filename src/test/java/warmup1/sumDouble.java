package warmup1;

public class sumDouble {
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if(a != b)
            return sum;

        return  2 * sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(3,2));
    }
}
