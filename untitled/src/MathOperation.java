public class MathOperation {
    public static int fact(int f) {
        if (f == 1||f==0) {
            return 1;
        }
        else if (f>1){
            return f * fact(f - 1);
        }
        else
            throw new RuntimeException("ЧИСЛО НЕ МОЖЕТ БЫТЬ ОТРИЦАТЕЛЬНЫМ");

    }

    public static byte sign (double i){
        if (i>0){
            return 1;
        }
        else if (i<0){
            return -1;
        }
        else
            return 0;
    }
}
