package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();
    static{
        loadProperties();
    }

    private static void loadProperties() {
    }

    public static String get (String key){
        return PROPERTIES.getProperty(key);
    }

    private PropertiesUtil(){
        try (var inputStream = Properties.class.getClassLoader().getResourceAsStream("Properties.file")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
