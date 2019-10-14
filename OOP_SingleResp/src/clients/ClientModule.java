package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

    /*
    This specific class could be possibly separated into multiple classes as this class
    has too much responsibility however for testing purposes it would be fine. But as a
    final versioning it does not adhere to the Single responsibility principle.
     */

    /*
    The Single Responsibility Principle:
    This principle states that a class should only have one responsibility. Thus a class
    should only have one reason to change! And that is it's responsibility has changed.
    If a class has more than one responsibility then you need to create a new class.
     */

    public static void main(String[] args) {
        Employee Susan = new Employee(1, "Susan", "Accounting", true);
        ClientModule.hireNewEmployee(Susan);
        printEmployeeReport(Susan, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, FormatType.CSV);
        System.out.println(formatter.getFormattedEmployee());
    }
}
