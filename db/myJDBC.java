import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;
public class myJDBC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //report 3 -----------------------------------------
       /* try {


            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rental_db", "root", "Mahamedlovesfood507");

             // using multiple tables for report 3.
            System.out.println("Enter Customer Name:");
            String inputName = s.nextLine();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT r.rental_id, r.rental_date, v.make, v.model FROM rental r " +
                            "JOIN customer c ON r.customer_id = c.customer_id " +
                            "JOIN vehicle v ON r.vehicleId = v.vehicleId " +
                            "WHERE c.name = ?"
            );
            ps.setString(1,inputName);



            Statement statement = connection.createStatement();




            ResultSet resultSet = statement.executeQuery(  "SELECT r.rental_id, c.name, v.make, v.model, r.rental_date " +
                    "FROM rental r " +
                    "JOIN customer c ON r.customer_id = c.customer_id " +
                    "JOIN vehicle v ON r.vehicleId = v.vehicleId");



       while (resultSet.next()) {


                System.out.println("Rental ID: " + resultSet.getInt("rental_id"));
                System.out.println("Rental Date: " + resultSet.getDate("rental_date"));
                System.out.println("Vehicle: " + resultSet.getString("make") + " " + resultSet.getString("model"));
                System.out.println("----------------------");
            }


        } catch (SQLException e) {
            e.printStackTrace();


        } */







        //report 2 ----------------------------------------------
      /* try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rental_db", "root", "Mahamedlovesfood507");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT r.rental_id, c.name, v.make, v.model, r.rental_date " +
                    "FROM rental r " +
                    "JOIN customer c ON r.customer_id = c.customer_id " +
                    "JOIN vehicle v ON r.vehicleId = v.vehicleId");

            while (resultSet.next()) {
                System.out.println("Rental ID: " + resultSet.getInt("rental_id"));
                System.out.println("Customer: " + resultSet.getString("name"));
                System.out.println("Vehicle: " + resultSet.getString("make") + " " + resultSet.getString("model"));
                System.out.println("Rental Date: " + resultSet.getDate("rental_date"));
                System.out.println("----------------------");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        } */









       // report 1 -----------------------------------------------------
       /* try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rental_db", "root", "Mahamedlovesfood507");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            while(resultSet.next()){

            System.out.println("ID: " + resultSet.getInt("customer_id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Contact: " + resultSet.getString("contactInfo"));
            System.out.println("License: " + resultSet.getString("LicenseNo"));}

        }
        catch(SQLException e){
            e.printStackTrace();
        } */




    }
}
