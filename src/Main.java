
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    // Arrays to store objects
    static BankBranch[] branches = new BankBranch[5];
    static Customer[] customers = new Customer[5];
    static LoanOfficer[] officers = new LoanOfficer[5];
    static LoanProduct[] products = new LoanProduct[5];
    static Guarantor[] guarantors = new Guarantor[5];
    static LoanApplication[] applications = new LoanApplication[5];
    static LoanRepayment[] repayments = new LoanRepayment[5];

    // Counters
    static int branchCount = 0;
    static int customerCount = 0;
    static int officerCount = 0;
    static int productCount = 0;
    static int guarantorCount = 0;
    static int applicationCount = 0;
    static int repaymentCount = 0;

    // Application status stored separately
    static String[] statuses = new String[5];

    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {

            System.out.println("\n===== LOAN MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Branch");
            System.out.println("2. Register Customer");
            System.out.println("3. Register Officer");
            System.out.println("4. Register Loan Product");
            System.out.println("5. Register Guarantor");
            System.out.println("6. Submit Application");
            System.out.println("7. Review Application");
            System.out.println("8. Approve / Reject Application");
            System.out.println("9. Record Repayment");
            System.out.println("10. View Records");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        registerBranch();
                        break;

                    case 2:
                        registerCustomer();
                        break;

                    case 3:
                        // registerOfficer();
                        break;

                    case 4:
                        // registerProduct();
                        break;

                    case 5:
                        // registerGuarantor();
                        break;

                    case 6:
                        // submitApplication();
                        break;

                    case 7:
                        // reviewApplication();
                        break;

                    case 8:
                        // decideApplication();
                        break;

                    case 9:
                        // recordRepayment();
                        break;

                    case 10:
                        // viewRecords();
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        input.close();
    }

    // registerBranch method to add a new branch
    static void registerBranch() {
        if (branchCount == 5) {
            System.out.println("Branch storage is full.");
            return;
        }

        System.out.print("Enter branch ID: ");
        int id = Integer.parseInt(input.nextLine());

        // Check for duplicate ID
        for (int i = 0; i < branchCount; i++) {
            if (branches[i].getBranchId() == id) {
                System.out.println("This ID already exists.");
                return;
            }
        }

        System.out.print("Enter branch name: ");
        String name = input.nextLine();

        System.out.print("Enter branch code: ");
        String code = input.nextLine();

        System.out.print("Enter branch location: ");
        String location = input.nextLine();

        System.out.print("Enter branch manager: ");
        String manager = input.nextLine();

        branches[branchCount] = new BankBranch(id, name, code, location, manager);
        branchCount++;
        System.out.println("Branch registered successfully.");
    }

    // register customer method

    static void registerCustomer() {

        if (customerCount == 5) {
            System.out.println("The customers are now full");
            return;
        }

        System.out.println("Enter the customer id");

        int id = Integer.parseInt(input.nextLine());

        for (int i = 0; i < customerCount; i++) {

            if (customers[i].getCustomerId() == id) {
                System.out.println("The customer already exists");
                return;
            }
        }

        System.out.println("enter the customers name");
        String name = input.nextLine();
        System.out.print("Enter customers Email: ");
        String email = input.nextLine();

        System.out.print("Enter customers age ");
        int age =Integer.parseInt(input.nextLine());

        System.out.print("Enter customers monthly income: ");
        double income = Double.parseDouble(input.nextLine());

        customers[customerCount] = new Customer(id, name, email, age, income);
        customerCount++;
        System.out.println("Customer registered successfully.");
    }

    
public static void registerOfficer() {

    if (officerCount == officers.length) {
        System.out.println("Officer storage is full.");
        return;
    }

    System.out.print("Enter officer ID: ");
    int id = Integer.parseInt(input.nextLine());

    // Check whether the ID already exists
    for (int i = 0; i < officerCount; i++) {
        if (officers[i].getOfficerId() == id) {
            System.out.println("Officer ID already exists.");
            return;
        }
    }

    if (id <= 0) {
        System.out.println("ID must be positive.");
        return;
    }

    System.out.print("Enter officer name: ");
    String name = input.nextLine();

    if (name.trim().isEmpty()) {
        System.out.println("Name cannot be empty.");
        return;
    }

    System.out.print("Enter officer email: ");
    String email = input.nextLine();

    if (!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
        System.out.println("Invalid email.");
        return;
    }

    System.out.print("Enter years of experience: ");
    int experience = Integer.parseInt(input.nextLine());

    if (experience < 0) {
        System.out.println("Experience cannot be negative.");
        return;
    }

    // An officer must belong to an existing branch
    System.out.print("Enter the branch ID: ");
    int branchId = Integer.parseInt(input.nextLine());

    BankBranch selectedBranch = null;

    for (int i = 0; i < branchCount; i++) {
        if (branches[i].getBranchId() == branchId) {
            selectedBranch = branches[i];
            break;
        }
    }

    if (selectedBranch == null) {
        System.out.println("Branch not found. Register it first.");
        return;
    }

    officers[officerCount] = new LoanOfficer(
        id, name, email, experience, selectedBranch
    );

    officerCount++;

    System.out.println("Loan officer registered successfully.");
}


public static void registerGuarantor() {

    if (guarantorCount == guarantors.length) {
        System.out.println("Guarantor storage is full.");
        return;
    }

    System.out.print("Enter guarantor ID: ");
    int id = Integer.parseInt(input.nextLine());

    for (int i = 0; i < guarantorCount; i++) {
        if (guarantors[i].getGuarantorId() == id) {
            System.out.println("Guarantor ID already exists.");
            return;
        }
    }

    if (id <= 0) {
        System.out.println("ID must be positive.");
        return;
    }

    System.out.print("Enter guarantor name: ");
    String name = input.nextLine();

    if (name.trim().isEmpty()) {
        System.out.println("Name cannot be empty.");
        return;
    }

    System.out.print("Enter guarantor email: ");
    String email = input.nextLine();

    if (!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
        System.out.println("Invalid email.");
        return;
    }

    System.out.print("Enter guarantor phone: ");
    String phone = input.nextLine();

    if (phone.trim().isEmpty()) {
        System.out.println("Phone cannot be empty.");
        return;
    }

    System.out.print("Enter monthly income: ");
    double income = Double.parseDouble(input.nextLine());

    if (income <= 0) {
        System.out.println("Income must be positive.");
        return;
    }

    guarantors[guarantorCount] = new Guarantor(
        id, name, email, phone, income
    );

    guarantorCount++;

    System.out.println("Guarantor registered successfully.");
}


}
