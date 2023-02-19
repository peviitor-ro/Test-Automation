package ro.peviitor.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil
{
    private static final Properties properties = readPropertiesFile();
    public static final String PATH = "src/test/resources/config.properties";

    private static Properties readPropertiesFile()
    {
        Properties props = new Properties();
        try (InputStream inputStream = new FileInputStream(ConfigUtil.PATH))
        {
            props.load(inputStream);
        } catch (IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException("config.properties file not found");
        }
        return props;
    }

    private static String getEnvironment()
    {
        String environment = properties.getProperty("environment");
        if (environment == null) throw new IllegalArgumentException("environment not specified in config.properties");
        return environment;
    }

    public static String getBrowser()
    {
        String browser = properties.getProperty("browser");
        if (browser == null) throw new IllegalArgumentException("browser not specified in config.properties");
        return browser;
    }

    public static String getTestMode()
    {
        String headless = properties.getProperty("headless");
        if (headless == null) throw new IllegalArgumentException("browser not specified in config.properties");
        return headless;
    }
}
