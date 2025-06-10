package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class SQLiteProgMain {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");

            connection.setAutoCommit(false);
            createTable(connection);
            insertValues(connection);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void createTable(Connection connection) {
        String sqlDrop = "DROP TABLE IF EXISTS employees;";
        String sqlCreate = "CREATE TABLE employees(id INT PRIMARY KEY," + "NAME TEXT, BIRTHDATE LONG, ADDRESS TEXT, SALARY REAL)";


        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDrop);
            statement.executeUpdate(sqlCreate);
            statement.close();

            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertValues(Connection connection){
        String sqlInsert= "INSERT INTO EMPLOYEES VALUES(0,'Ionel Popescu',1749306321154,"+"'Stefan cel Mare',2000)";

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlInsert);
            statement.close();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
