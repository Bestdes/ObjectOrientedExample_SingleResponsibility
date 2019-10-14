package domain.dao;


import database.DatabaseConnectionManager;
import domain.Employee;

public class EmployeeDAO {

    /*
    DAO stands for Data Access Object
     */

    DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();

    public void saveEmployee(Employee employee) {
        System.out.println("Saving employee to database...");
        connectionManager.connect();
        connectionManager.getConnectionObj();
        connectionManager.disconnect();
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleting employee from database...");
    }

}
