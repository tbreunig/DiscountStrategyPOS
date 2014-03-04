package discountstrategypos;

/**
 * @author Tyler
 */
public class PercentageBasedDiscount implements DiscountStrategy {

    private double discountPercentage;

    @Override
    public double findDiscount(double productCost, double quantity) {
        return (productCost * quantity) * discountPercentage;
    }

    public PercentageBasedDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        getDiscountPercentage();
        setDiscountPercentage(discountPercentage);
    }

    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    
//    public static void main(String[] args) {
//        PercentageBasedDiscount pbd = new PercentageBasedDiscount(.10);
//        pbd.setDiscountPercentage(.20);
//        double result = pbd.findDiscount(100., 1);
//        System.out.println(result);
//    }
}
