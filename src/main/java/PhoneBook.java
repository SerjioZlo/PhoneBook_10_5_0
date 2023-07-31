import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    static Map<String,String> contacts = new HashMap<>();

    public Integer add (String name, String number){
        if(contacts.containsKey(name)){
            return -1;
        } else {
            contacts.put(name, number);
            return contacts.size();
        }
    }

    public String findByNumber(String number){
        return null;
    }
}