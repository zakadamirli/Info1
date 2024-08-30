package Ikinci_Ay.PrintttStackTrace;
public class Practise {

    public static void printCustomStackTrace() {
        ArithmeticException e = new ArithmeticException("/ by zero");

        StackTraceElement[] stackTrace = e.getStackTrace();

        System.err.println("Exception in thread \"main\" " + e);
        for (StackTraceElement element : stackTrace) {
            System.err.println("\tat " + element);
        }
    }

    public static void main(String[] args) {
        printCustomStackTrace();
    }
}

