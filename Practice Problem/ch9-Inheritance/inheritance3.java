package learning.java;

//BasePlusCommissionEmployee class represents an employee who receives a base salary in addition to commission

public class BasePlusCommissionEmployee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary)
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
        setBaseSalary( salary );
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


    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
