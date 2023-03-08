package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
//        if (dividend / divider * divider ==dividend ) {
//            System.out.println("can be divided completely");
//        }  else {
//            System.out.println("cannot be divided completely");
//        }
//        if (divider <= 0) {
//
//                throw new IllegalArgumentException("division by zero");
//            }


        if (divider == 0.0) {
            throw new IllegalArgumentException("division by zero");
        } else if (dividend / divider * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}



