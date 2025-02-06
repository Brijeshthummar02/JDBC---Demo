import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";     // Private helps for security and hides url from users
    private static final String username = "root";
    private static final String password = "Brijesh3131";

    public static void main(String[] args) {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver"); //LOADS DRIVERS
       }catch(ClassNotFoundException e) {
           System.out.println(e.getMessage());
       }
      try {
          Connection connection = DriverManager.getConnection(url, username, password);
          connection.setAutoCommit(false);
          String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ? ";
          String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
          PreparedStatement debitPreparedstatement = connection.prepareStatement(debit_query);
          PreparedStatement creditPreparedstatement = connection.prepareStatement(credit_query);
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter account number: ");
          int account_number = scanner.nextInt();
          System.out.println("Enter amount");
          double amount = scanner.nextDouble();
          debitPreparedstatement.setDouble(1, amount);
          debitPreparedstatement.setInt(2, account_number);
          creditPreparedstatement.setDouble(1, amount);
          creditPreparedstatement.setInt(2, 102);
          debitPreparedstatement.executeUpdate();
          creditPreparedstatement.executeUpdate();

          if(isSufficient(connection, account_number, amount)){
              connection.commit();
              System.out.println("Transaction Successfull");
          }else{
              connection.rollback();
              System.out.println("Transaction Failed");
          }

      }catch(SQLException e) {
          System.out.println(e.getMessage());
      }

    }
    static boolean isSufficient(Connection connection, int account_number, double amount){
        try {
            String query = "SELECT balance FROM accounts WHERE account_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (amount > current_balance) {
                    return false;
                } else {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

