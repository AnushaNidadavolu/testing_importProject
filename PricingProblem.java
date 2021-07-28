
package pricing.problem;
import java.util.Scanner;

public class PricingProblem {
    public static void main(String[] args) {

        System.out.println(new Product(3600,2.25,"Michigam"));
        System.out.println(new Product(1000,10,"AB"));
        System.out.println(new Product(200,1.1,"quebec"));
        System.out.println(new Product(5000,2.5,"de"));
        System.out.println(new Product(500,6,"ONTARIO"));


        //In case we wish to enter console input, pls uncomment the below block
        /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int n=sc.nextInt();
        System.out.println("Enter price per item: ");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter 2-letter province/state code: ");
        String code=sc.nextLine();
        Product obj=new Product(n, price, code);
        System.out.println(obj.toString());*/
    }
    
}
