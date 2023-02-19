package ro.peviitor.utils;

import java.util.HashMap;

public class ScenarioContext
{
    private static final HashMap<String, Object> scenarioContexts = new HashMap<>();

    public static void setContext(String key, Object value) {
        scenarioContexts.put(key, value);
    }

    public static Object getContext(String key) {
        return scenarioContexts.get(key);
    }

    public Boolean isContaining(String key){
        return scenarioContexts.containsKey(key);
    }
}
