public class Customer {
    // attributes

    private int customerId;
    private String customerName;
    private String customerEmail;
    private int customerAge;
    private double monthlyIncome;
    // constructor for customer

    public Customer(int customerId, String customerName,
            String customerEmail, int customerAge, double monthlyIncome) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAge = customerAge;
        this.monthlyIncome = monthlyIncome;
    }
    // implementing the getters and setters

    // getter
    public  int getCustomerId(){
        return customerId;
    }
    public  String getcustomerName(){
        return customerName;
    }
    public  String getCustomerEmail(){
        return customerEmail;
    }
    public  int getCustomerAge(){
        return customerAge;
    }
     public  double getMonthlyIncome(){
        return monthlyIncome;
    }

    // setters

    public  void setcustomerId(int customerId){

    }

     public  void setcustomerName( String customerName){

    }

     public  void setcustomerEmail(String customerEmail){

        this.customerEmail= customerEmail;

    }

     public  void setcustomerAge(int customerAge){

        this.customerAge= customerAge;

    }

      public  void setmonthlyIncome(double monthlyIncome){

        this.monthlyIncome= monthlyIncome;

    }

}
