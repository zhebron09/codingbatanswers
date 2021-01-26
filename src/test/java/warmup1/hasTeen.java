package warmup1;

public class hasTeen {

    public static boolean hasTeen(int a, int b, int c) {
        boolean teen = (a >= 13 && a <= 19)||(b >= 13 && b <= 19)||(c >= 13 && c <= 19);
        return(teen);

    }

    public static void main(String[] args) {
        System.out.println(hasTeen(13,20,10));
    }
}


