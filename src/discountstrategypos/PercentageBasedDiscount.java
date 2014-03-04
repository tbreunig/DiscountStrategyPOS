package discountstrategypos;

/**
 * @author Tyler
 */
public class PercentageBasedDiscount implements DiscountStrategy {

    private double discountPercentage;

    @Override
    public double findDiscountAmount(double productCost, double quantity) {
        return (productCost * quantity) * discountPercentage;
    }

    public PercentageBasedDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        getDiscountPercentage();
        setDiscountPercentage(discountPercentage);
    }

    @Override
    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public static void main(String[] args) {
        DiscountStrategy pbd = new PercentageBasedDiscount(.10);
        double result = pbd.findDiscountAmount(100., 1);
        
        String output = String.format("You saved: $%.2f!", result);
        System.out.println(output);
    }
}
