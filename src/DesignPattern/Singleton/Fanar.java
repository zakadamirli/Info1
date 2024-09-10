package DesignPattern.Singleton;

public class Fanar {

    private static volatile Fanar f = null;

    private Fanar() {

    }

    public static Fanar singleton() {
        if (f == null) {
            synchronized (Fanar.class) {
                if (f == null) {
                    f = new Fanar();
                }
            }
        }
        return f;
    }
}
