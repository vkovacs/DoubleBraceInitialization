package hu.crs;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        System.out.println("Ok: " + gson.toJson(map));
        System.out.println("Not Ok: " + gson.toJson(new HashMap<String, String>(){{put("b", "2");}}));
    }
}
