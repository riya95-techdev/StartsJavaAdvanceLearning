/*
Question 2: orElseThrow
You have a method that is supposed to retrieve a configuration value. If the value is not present, it should throw an exception.
Write a method getConfigValue(String key) that returns an Optional<String>.
Inside the method, simulate a lookup. If the key is "api_key", return Optional.of("abc-123"). For any other key, return Optional.empty().
In your main method, call getConfigValue("database_url") and use orElseThrow to throw an IllegalArgumentException with the message "Configuration key not found!".
 */

import java.util.Optional;
public class OptionalPractice {
    public static Optional<String> getConfigValue(String key){
        if("api_123".equals(key))
            return Optional.of("abc_123");
        else
            return Optional.empty();
    }


public static void main(String[] args) {

    Optional<String> configOptional1 = getConfigValue("api_123");
    System.out.println(configOptional1.get());
    String configValue1 = configOptional1.orElseThrow( () -> new IllegalArgumentException("Configuration key not found!"));

    Optional<String> configOptional2 = getConfigValue("database_url");

    String configValue2 = configOptional2.orElseThrow( () -> new IllegalArgumentException("Configuration key not found!"));

    System.out.println("Configuration value found : "+ configOptional1);

    }
}
