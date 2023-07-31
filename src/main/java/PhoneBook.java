import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    static Map<String, String> contacts = new HashMap<>();

    public Integer add(String name, String number) {
        if (contacts.containsKey(name)) {
            return -1;
        } else {
            contacts.put(name, number);
            return contacts.size();
        }
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)){
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name){
        for(Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getKey().equals(name)){
                return entry.getValue();
            }
        }
        return null;
    }

    public List<String> printAllNames(){
        return null;
    }
}