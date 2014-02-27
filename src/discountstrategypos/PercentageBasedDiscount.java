package discountstrategypos;

import javax.swing.JOptionPane;

/**
 * @author Tyler
 */
public class PercentageBasedDiscount {
     private double discountPercentage;
     private double itemPrice;
     private double quantity;

    public PercentageBasedDiscount(double itemPrice, double quantity, double discountPercentage) {
        if(discountPercentage < 0){
            JOptionPane.showMessageDialog(null, "Can't do that!");
        }else{
            this.discountPercentage = discountPercentage;
        }
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double getDiscountPercentage() {
        return itemPrice * discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {

            this.discountPercentage = discountPercentage;
        
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

     

     
    
    //MAIN TESTING METHOD
    public static void main(String[] args) {
        PercentageBasedDiscount pbd = new PercentageBasedDiscount(100.00, 1, -7);
        
        System.out.printf("Discount is: $%.2f", pbd.getDiscountPercentage());
    }
     
}
