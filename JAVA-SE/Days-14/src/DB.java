import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mariadb://localhost:3306/java_se";
    private final String username = "root";
    private final String password = "";

    private Connection connection = null;

    public Connection connect() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Success");
            }
        } catch (Exception ex) {
            System.err.println("Connection Error!:" + ex);
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection Close");
            }
        } catch (Exception e) {
            System.err.println("Close Error:" + e);
        }
    }
}
