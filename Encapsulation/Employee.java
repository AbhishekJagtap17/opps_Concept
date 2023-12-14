package Encapsulation;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeesalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getEmployeesalary() {
        return employeesalary;
    }
    public void setEmployeesalary(int employeesalary) {
        this.employeesalary = employeesalary;
    }
    public static void main(String[] args) {
     Employee employee=new Employee();
     employee.setEmployeeId(101);
     employee.setEmployeeName("Sidd");
     employee.setEmployeesalary(100000);

        System.out.println("Employee ID \t"+employee.getEmployeeId());
        System.out.println("Employee Name \t"+employee.getEmployeeName());
        System.out.println("Employee Salary \t"+employee.getEmployeesalary());
    }
}
