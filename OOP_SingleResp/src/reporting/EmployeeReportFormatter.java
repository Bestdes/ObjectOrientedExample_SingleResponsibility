package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
//        this.anEmployee = anEmployee;
//        this.formatType = formatType1;
    }

    public String getFormattedEmployee() {
        System.out.println("Getting formatted type...");
        return getFormattedValue();
    }
}
