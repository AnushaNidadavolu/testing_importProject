package pricing.problem;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Testcases {
    public static void main(String args[])
    {
        System.out.println(new Product(500,1,"Ontario"));
        System.out.println(new Product(3600,2.25,"Michigan"));
        System.out.println(new Product(1000,10,"AB"));
        System.out.println(new Product(2500,1.1,"qc"));
        System.out.println(new Product(5000,2.5,"de"));
    }

    @Test
    public void invalidProvinceTest() throws Exception{
        try{
            System.out.println(new Product(50, 45.35, "NewYork"));
            System.out.println("Above is the cost considering zero provincial tax.");
        }catch(IllegalStateException ie){
            assertThat(ie.getMessage(), is("This is not a valid province"));
        }
    }

    @Test
    public void longDecimalNumberTest() throws Exception{
        System.out.println(new Product(1,0.584785,"on"));
    }

    @Test
    public void tooBigNumberTest() throws Exception{
        System.out.println(new Product(100000, 200000, "QUEBEC"));
    }

    @Test
    public void negativePriceTest() throws Exception{
        try{
            System.out.println(new Product(-10,6,"de"));
        }catch (ArithmeticException ae){
            assertThat(ae.getMessage(), is("Cost can't be zero or negative value"));
        }
    }

    @Test
    public void zeroPriceTest() throws Exception{
        try{
            System.out.println(new Product(10,0,"ab"));
        }catch (ArithmeticException ae){
            assertThat(ae.getMessage(), is("Cost can't be zero or negative value"));
        }
    }

}
