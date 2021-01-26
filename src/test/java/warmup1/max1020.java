package warmup1;

public class max1020 {

    public static int max1020(int a, int b) {

        if((a > 20 || a < 10) && ( b > 20 || b < 10 )) {
            return 0;
        }else{
            if(a<b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if(a>=10 && a <=20){
                return a;}
            else{return b;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(max1020(11,19));
    }
}
