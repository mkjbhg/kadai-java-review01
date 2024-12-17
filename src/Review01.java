
public class Revie01 {

    public static void main(String[] args) {
        int beforeTaxPrice1 = 1500;
        int tax = tax(beforeTaxPrice1);
        int price = beforeTaxPrice1 + tax;
System.out.println(beforeTaxPrice1 + "円の商品の税込み価格は" + price + "円（消費税は" + tax + "円)です。");
}

public static int tax(int beforeTaxPrice2) {
    int result = (int) (beforeTaxPrice2 * 0.1);
    return result;
}
    }

