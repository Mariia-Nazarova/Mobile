public class Main {
    public static void main(String[] args) {
        double balance = 100.20; //баланс моб тел, руб
        double refill = 1300.51;//сумма пополнения, руб

        int bonus = (int) refill / 100; //бонус за каждые 100 руб, руб
        boolean promo = refill >= 1000; // пополнение на 1000 руб и выше
        double total = promo ? (balance + refill + bonus) : (balance + refill);

        System.out.println("Начислено бонусов: " + bonus + " руб.");
        System.out.println("Баланс: " + total + " руб.");


    }
}
