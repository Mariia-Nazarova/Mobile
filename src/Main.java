public class Main {
    public static void main(String[] args) {
        double balance = 100.20; //баланс моб тел, руб
        double refill = 70;//сумма пополнения, руб

        int bonus = (int) refill / 100; //бонус за каждые 100 руб, руб
        boolean promo = refill > 1000; // пополнение свыше 1000 руб
        double total = promo ? (balance + refill + bonus) : (balance + refill);

        if (promo) {
            System.out.println("Начислено бонусов: " + bonus + " руб.");
        } else {
            System.out.println("Начислено бонусов: 0 руб.");
        }

        System.out.println("Баланс: " + total + " руб.");
    }
}
