package discountstrategypos;

/**
 * @author Tyler
 */
public class QuantityBasedDiscount implements DiscountStrategy {

    private double discountPercentage;
    private double minQty;

    @Override
    public double findDiscountAmount(double productCost, double quantity) {

        double deefault = 0;

        if (quantity >= minQty) {
            System.out.println("Buy one! Get one half off!");
            deefault = (productCost * quantity) * discountPercentage;
        } else {

            System.out.println("Does not meet minimum quantity requirement. Try again.");   
        } 
        return deefault;
    }

    public QuantityBasedDiscount(double minQty, double discountPercentage) {
        this.minQty = minQty;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    //TESTING
    public static void main(String[] args) {
        DiscountStrategy qbd = new QuantityBasedDiscount(1, .50);
        qbd.setDiscountPercentage(.50);
        double result = qbd.findDiscountAmount(100, 1);

        String output = String.format("You saved: $%.2f!", result);
        System.out.println(output);

    }

}
