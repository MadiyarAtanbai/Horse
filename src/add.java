import org.postgresql.jdbc.UUIDArrayAssistant;
import Дата.Madiyar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//public class add {
//    public static void main(String[] args) {
//        try{
//            Properties properties = new Properties();
//            FileInputStream fileInputStream = new FileInputStream("file.properties");
//            properties.load(fileInputStream);
//            String url = properties.getProperty("db.url");
//            String login = properties.getProperty("db.login");
//            String password  = properties.getProperty("db.passowrd");
//
//            Connection connection = DriverManager.getConnection(url,login,password);
//
//            Statement statement = connection.createStatement();
//            statement.execute("alter table new add column test varchar(520) null ");
//            PreparedStatement prSt = connection.prepareStatement("update news set subject = ? where id = ? ");
//            prSt.setString (1, "test");
//            prSt.setString(2,"sdf");
//            prSt.setInt(2,1);
//            int result = prSt.executeUpdate() ;
//
//
//        }catch (Exception e ) {
//            System.out.println("кателык "+ e.getLocalizedMessage());
//        }}}

//        try {
//            Coonection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "makenzzo1");
//        Statement st = connection.createStatement();
//
//
//        int result = st.executeUpdate("update newa set subject ='asdaf ' where id = 16");
//            System.out.println(result);
//
//        }catch (SQLException e ){
//            System.out.println("katelik :"+e.getMessage()r);
//        }
//
//
//    }
//}
//        try {
//            Conectnion connection -DriverManager.getConnection(" ", "", "");
//            Statement st = connection.createStatement();
//
//
//            int result = st.executeUpdate("ubdate new set subject = ' asd' where id = 16 ");
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//
//        }
//    }
//}
//
//    public class add {
//        public static void main(String[] args) {
//            try{
//                Properties properties = new Properties();
//                FileInputStream fileInputStream = new FileInputStream("file.properties");
//                properties.load(fileInputStream);
//                String url = properties.getProperty("db.url");
//                String login = properties.getProperty("db.login");
//                String password  = properties.getProperty("db.passowrd");
//
//                Connection connection = DriverManager.getConnection(url,login,password);
//
//                Statement statement = connection.createStatement();
//                statement.execute("alter table new add column test varchar(520) null ");
//                PreparedStatement prSt = connection.prepareStatement("update news set subject = ? where id = ? ");
//                prSt.setString (1, "test");
//                prSt.setString(2, String.valueOf(16));
//                prSt.setInt(2,1);
//                int result = prSt.executeUpdate() ;
//
//
//            }catch (Exception e ) {
//                System.out.println("кателык "+ e.getLocalizedMessage());
//            }
//        }
//    }

//            try {
//            Properties properties = new Properties();
//            FileInputStream fileInputStream = new FileInputStream("file.properties");
//            properties.load(fileInputStream);
//            String url = properties.getProperty("db.url");
//            String login = properties.getProperty("db.login");
//            String passowrd = properties.getProperty("db.passowrd");
//
//            Connection connection = DriverManager.getConnection(url,login,passowrd);
//
//            Statment statment = connection.createStatement();
//            statment.execute ("alter table new add column test varchar(520) null");
//            PreparedStatment prsSt = connection.preparedStatment("update news set subject =? where id = ? ");
//            prSt.setString (1,"test");
//            prsStr.SetString(2,"asd");
//            prsSt.setInt (2,1);
//
//            }catch (Exception e ){
//                System.out.println("katelik"+e.getLocalizedMessage());
//
//            }
//
//        }
//        }
public class add {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("file.properties");
            properties.load(fileInputStream);
            String url = properties.getProperty("db.url");
            String login = properties.getProperty("db.login");
            String password  = properties.getProperty("db.passowrd");

            Connection connection = DriverManager.getConnection(url,login,password);

            Statement statement = connection.createStatement();
            statement.execute("alter table new add column test varchar(520) null ");
            PreparedStatement prSt = connection.prepareStatement("update news set subject = ? where id = ? ");
            prSt.setString (1, "test");
            prSt.setString(2, String.valueOf(16));
            prSt.setInt(2,1);
            int result = prSt.executeUpdate() ;


        }catch (Exception e ) {
            System.out.println("кателык "+ e.getLocalizedMessage());
        }
    }
}