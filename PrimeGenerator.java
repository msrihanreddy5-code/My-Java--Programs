class PrimeGenerator extends Thread {

    int limit;

    PrimeGenerator(int limit) {
        this.limit = limit;
    }

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void run() {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeGenerator pg = new PrimeGenerator(50);
        pg.start();
    }
}
