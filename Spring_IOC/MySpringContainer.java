package Spring_IOC;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MySpringContainer {
    // A container to manage Person object --- Map
    private static Map<String, Person> personMap = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("./Spring_IOC/MyApplication.yaml");
        try {
            properties.load(inputStream);
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = (String) properties.get(key);
                String[] values = value.split(",");
                Person person = new Person(values[0], values[1]);
                personMap.put(key, person);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Design a method, if input an ID, then return an object
    public static Person getBean(String id) {
        return personMap.get(id);
    };
}
