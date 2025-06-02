// BasePlusCommissionEmployee inherits protected instance
// variables from CommissionEmployee.

public class CommissionEmployee {

    protected String firstName;   //change..............
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public void setGrossSales(double sales) {
        if (sales >= 0.0)
            grossSales = sales;
        else
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0)
            commissionRate = rate;
        else
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    public double earnings() {
        return commissionRate * grossSales;
    }

}


public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary )
    {
        super( first, last, ssn, sales, rate );
        setBaseSalary( salary );
    }

    public void setBaseSalary( double salary )
    {
        if ( salary >= 0.0 )
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0" );
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }
}


public class Main {

    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
        System.out.printf( "%s %.2f\n", "Base salary is", employee.getBaseSalary());
    }
}
