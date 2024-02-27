package JDBC;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
public class Proper {
    public String proper(String key){
        try {
            Properties properties=new Properties();
            FileReader fileInputStream=new FileReader("./file.properties");
            properties.load(fileInputStream);
            return properties.getProperty(key);

        }catch (Exception e){
            System.out.println(e.getMessage());
            return "";

        }
    }
}
