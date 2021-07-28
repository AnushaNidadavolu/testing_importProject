package pricing.problem;

public class Product {

    private int numberOfItems;
    private double price;
    private String code;

    public Product(int numberOfItems, double price, String code) {
        this.numberOfItems = numberOfItems;
        this.price = price;
        this.code = code;
    }

    //calculate the provincial sales tax
    public double calculateTax() {
        try {
        if (this.code.toLowerCase().startsWith("ab")) {
            return 0.05;
        } else if (this.code.toLowerCase().startsWith("on")) {
            return 0.13;
        } else if (this.code.toLowerCase().startsWith("qc") || this.code.toLowerCase().startsWith("qu")) {
            return 0.14975;
        } else if (this.code.toLowerCase().startsWith("mi")) {
            return 0.06;
        } else if (this.code.toLowerCase().startsWith("de")) {
            return 0.0;
        } else
            throw new IllegalStateException(" This is not a valid province");
        }catch (IllegalStateException ie){
            System.out.println("Input Error:"+ie.getMessage());
        }
        //returning sales tax as 0 if it's not matching any given province
        return 0;
    }

    //calculate volume based discount
    public double calculateDiscount() {
        if (this.numberOfItems * this.price >= 10000) {
            return 0.1;
        } else if (this.numberOfItems * this.price >= 7000) {
            return 0.07;
        } else if (this.numberOfItems * this.price >= 5000) {
            return 0.05;
        } else if (this.numberOfItems * this.price >= 1000) {
            return 0.03;
        } //if the cost is less than 1000, then discount remains 0
        return 0;
    }

    //calculate final & total cost
    public double totalCost() {
        double temp=0;
        try{
            temp = (this.numberOfItems * this.price);
            temp -= (temp * calculateDiscount());
            temp += (temp * calculateTax());
            if(temp<=0) {
                throw new ArithmeticException(" Cost can't be zero or negative value");
            }
        }catch (ArithmeticException e){
            System.out.println("Input Error:"+e.getMessage());
            System.exit(0);
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Total Amount is: $" + totalCost();
    }

}
