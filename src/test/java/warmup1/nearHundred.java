package warmup1;

public class nearHundred {
    public static boolean nearHundred(int n) {
        return (( Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10 ));
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
    }
}


