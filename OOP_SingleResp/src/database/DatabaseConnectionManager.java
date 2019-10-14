package database;

public class DatabaseConnectionManager {

    public DatabaseConnectionManager() {
    }

    public void connect() {
        System.out.println("Database is connecting...");
    }

    public void getConnectionObj() {
        System.out.println("Getting connection object...");
    }

    public void disconnect() {
        System.out.println("Database is disconnecting...");
    }

    public void getManagerInstance() {
        System.out.println("Getting database connection manager...");
    }
}
