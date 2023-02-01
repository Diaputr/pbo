package minggu12;
public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }
}