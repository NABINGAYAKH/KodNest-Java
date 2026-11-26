public class Task17 {
    public static void main(String[] args) {
        double price = 2500.0;
        double discount = 2500.0 * 10 / 100;
        double res = price > 2000 ? discount + price : 2500.0;
        System.out.println(res);
    }
}
