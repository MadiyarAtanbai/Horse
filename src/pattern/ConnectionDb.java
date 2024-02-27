package pattern;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionDb {
    static Connection connection;

    private ConnectionDb() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = new Properties();
                FileInputStream fileInputStream = new FileInputStream("file.properties");
                properties.load(fileInputStream);
                String url = properties.getProperty("db.url");
                String login = properties.getProperty("db.login");
                String password = properties.getProperty("db.passowrd");
            } catch (Exception e) {
                e.fillInStackTrace();
                return connection;
            }
        }
        return connection;
    }

}
