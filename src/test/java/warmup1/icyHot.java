package warmup1;

public class icyHot {

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100 || (temp2 < 0 && temp1 > 100));
    }

    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
    }
}

