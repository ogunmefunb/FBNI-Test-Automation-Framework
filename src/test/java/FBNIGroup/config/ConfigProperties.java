package FBNIGroup.config;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Dennis on 19/08/2020.
 */

public class ConfigProperties {
    private  static String CONFIG_PROPERTIES = "config.properties";
    private static Properties properties= new Properties();
    private static String env = System.getProperty("environment");

    static{
        try
        {
            properties.load(ConfigProperties.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES));
        }
        catch (IOException ex)
        {
            // Should Fail, we can not work without config.properties
        }
    }

    public String getEnv()
    {
        return env;
    }

    private String getEnvProperty(String name)
    {
        return properties.getProperty(env + "." +name);
    }

    private String getProperty(String name)
    {
        return properties.getProperty(name);
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
    public String getHomeUrl()
    {
        return  getEnvProperty("qaUrl");
    }
    public String getUsername()
    {
        return properties.getProperty("username");
    }

}
