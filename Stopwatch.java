public class Stopwatch {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            int sec = 0;
            try {
                while (true) {
                    System.out.println("Seconds: " + sec++);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {}
        });

        t.start();
    }
}
