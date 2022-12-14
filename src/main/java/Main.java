public class Main {
    public static final int BUYERS = 10;

    public static void main(String[] args) {
        final Dealer dealer = new Dealer();
        for (int i = 1; i <= BUYERS; i++) {
            new Thread(null, dealer::sellCar, "Покупатель " + i).start();
        }
        new Thread(null, dealer::receiveCar, "Производитель").start();
    }
}
