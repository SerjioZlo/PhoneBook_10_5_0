import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testAdd() {
        int result = phoneBook.add("John", "12345");
        Assert.assertEquals(1, result);

        result = phoneBook.add("Jane", "67890");
        Assert.assertEquals(2, result);

        result = phoneBook.add("John", "54321");
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("John", "12345");

        String result = phoneBook.findByNumber("12345");
        Assert.assertEquals("John", result);

        phoneBook.add("Petya", "321");
        result = phoneBook.findByNumber("321");
        Assert.assertEquals("Petya", result);

        result = phoneBook.findByNumber("1111");
        Assert.assertNull(result);
    }

    @Test
    public void testFindByName(){
        phoneBook.add("Jack", "987");

        String result = phoneBook.findByName("Jack");
        Assert.assertEquals("987", result);

        result = phoneBook.findByName("Vanya");
        Assert.assertNull(result);
    }

    @Test
    public void testPrintAllName(){

        List<String> names = phoneBook.printAllNames();
        Assert.assertTrue(names.isEmpty());

        phoneBook.add("Petya", "1234");
        phoneBook.add("Vanya", "343333");
        phoneBook.add("Julia", "1111");

        names = phoneBook.printAllNames();

        Assert.assertEquals("Julia", names.get(0));
        Assert.assertEquals("Petya", names.get(1));
        Assert.assertEquals("Vanya", names.get(2));
    }

}