import java.util.Random;

/**
 * Created by charles on 7/17/14.
 */
public class Main {

    private static int failTest = -1;

    private static String failtTestString = null;

    public static void main(String args[]) {
        if (failTest == 0) {
            if (failtTestString == "hello") {
                System.out.println("I GOT THROUGH IT ALL");
                looper(failTest, 10);
            } else {
                System.out.print("I FAILED");
            }
        } else {
            System.out.println("I Really Failed");
        }
    }

    private static void looper(int start, int count) {
        for (int i = start; i < count; i++) {
            System.out.println("Starting loop: " + Integer.toString(i));
            boolean evenOdd = caseExample(i);
            if (evenOdd) {
                System.out.println("ODD");
            } else {
                System.out.println("EVEN");
            }
        }
    }


    public static boolean caseExample(int testInt) {
        switch (testInt) {
            case 0:
                throw new NumberFormatException("Zero is neither even nor odd");
            case 1:
                return true;

            case 2:
                return false;

            case 3:
                return true;

            case 4:
                return false;

            case 5:
                return true;

            case 6:
                return false;

            case 7:
                return true;

            case 8:
                return false;

            case 9:
                return true;

            case 10:
                return false;

            default:
                throw new NumberFormatException("I don't understand the number: " + Integer.toString(testInt));

        }
    }

}
