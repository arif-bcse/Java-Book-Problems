public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Employee(String firstName , String lastName , double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName(String name){
        firstName=name;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String name){
        firstName=name;
    }
    public String getLastName(){
        return firstName;
    }
    public void setSalary(double sal){
        salary = sal;
    }
    void display(){
        System.out.println("Employee  info : "+firstName +" " +lastName+" " +salary);
    }
}
