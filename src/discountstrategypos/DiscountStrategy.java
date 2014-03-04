package discountstrategypos;
/**
 * @author Tyler
 */
public interface DiscountStrategy {

  public abstract double findDiscountAmount(double productCost, double quantity);

  public abstract double getDiscountPercentage();
 
  public abstract void setDiscountPercentage(double discountPercentage);
  
//  public abstract double getMinimumQuantity();
//  
//  public abstract void setMinimumQuantity(double minQty);
  
}
