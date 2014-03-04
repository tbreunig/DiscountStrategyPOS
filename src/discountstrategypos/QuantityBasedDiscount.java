package discountstrategypos;

/**
 * @author Tyler
 */
public class QuantityBasedDiscount implements DiscountStrategy {

    private double discountPercentage;
    private double minQty;

    @Override
    public double findDiscount() {
        return discountPercentage;
    }

    public QuantityBasedDiscount(double quantity) {

        if (quantity < minQty) {
            System.out.println("Does not meet the requirements");
        } else {
            setDiscountPercentage(discountPercentage);
        }

    }

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    //TESTING
    public static void main(String[] args) {
        QuantityBasedDiscount qbd = new QuantityBasedDiscount(2);
        qbd.setMinQty(3);

    }
}
