package warmup1;

public class close10 {

    public static int close10(int a, int b) {

        int aDiff = Math.abs(10-a);
        int bDiff = Math.abs(10-b);

        if(aDiff < bDiff) {
            return a;
        }
        if(aDiff > bDiff) {
            return b;
        }
        else { return 0;}


    }

    public static void main(String[] args) {

        System.out.println(close10(8,13));           // practice :)
    }
}

