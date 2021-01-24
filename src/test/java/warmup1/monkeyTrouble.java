package warmup1;

public class monkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
    }
}
