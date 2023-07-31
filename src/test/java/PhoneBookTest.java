import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testAdd() {
        int result = phoneBook.add("John", "12345");
        Assert.assertEquals(1, result);

        result = phoneBook.add("Jane", "67890");
        Assert.assertEquals(2, result);
    }
}