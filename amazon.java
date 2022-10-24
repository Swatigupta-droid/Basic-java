import java.util.*;
import java.io.*;

class amazon {
    public static List<String> implementAPI(List<String> logs) {
        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String log : logs) {
            String[] arr = log.split(" ");
            if (arr[0].equals("register")) {
                if (map.containsKey(arr[1])) {
                    result.add("Username already exists");
                } else {
                    map.put(arr[1], arr[2]);
                    result.add("Registered Successfully");
                }
            } else if (arr[0].equals("login")) {
                if (!map.containsKey(arr[1])) {
                    result.add("Username does not exist");
                } else if (!map.get(arr[1]).equals(arr[2])) {
                    result.add("Incorrect password");
                } else if (set.contains(arr[1])) {
                    result.add("Already logged in");
                } else {
                    set.add(arr[1]);
                    result.add("Logged In Successfully");
                }
            } else {
                if (!set.contains(arr[1])) {
                    result.add("Already logged out");
                } else {
                    set.remove(arr[1]);
                    result.add("Logged Out Successfully");
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("register user05 qwerty");
        logs.add("login user05 qwerty");
        logs.add("logout user05");
        System.out.println(implementAPI(logs));
    }
}