
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int taxRate = 10;
        int tax = tax(price, taxRate);
        int totalPrice = price + tax;
        System.out.print(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + tax + "円）です。");
    }

    public static int tax(int price, int taxRate) {
        int result = price*taxRate/100;
        return result;
    }

}
