
import java.util.Scanner;
// import java.util.ArrayList;




public class Main {
    public static void main(String[] args) throws Exception {
       Customer cus= new Customer(1, "Divine", "divi@nyabugogo", 20, 10000000000.00);
        cus.setcustomerName("Thierry");
        String customerName= cus.getcustomerName();
        
       System.out.println("my name is "+customerName );
    }
}
