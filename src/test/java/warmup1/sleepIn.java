package warmup1;

public class sleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));
    }
}
