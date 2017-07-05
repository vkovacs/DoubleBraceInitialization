package hu.crs;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, String> okMap = new HashMap<>();
        //1
        okMap.put("a", "1");
        System.out.println("Ok: " + gson.toJson(okMap));

        //2
        Map<String, String> notOkMap = new HashMap<String, String>() {{
            put("b", "2");
        }};
        System.out.println("Not Ok: " + gson.toJson(notOkMap));

        //3
        MapChildrenClass mapChildrenClass = new MapChildrenClass();
        System.out.println("Map children class: " + gson.toJson(mapChildrenClass));
    }
}
