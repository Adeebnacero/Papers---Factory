package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ContactTest extends TestCase {

    Contact contact = new Contact("0849262255", "1488 Block L", "0152");
    @Test
    public void testContactAddress()
    {
        assertEquals(contact.getAddress(), "1488 Block L");
    }
    @Test
    public void testContactPostalCode()
    {
        assertEquals(contact.getPostalCode(), "0152");
    }
    @Test
    public void testCellphone()
    {
        assertEquals(contact.getCellphone(), "0849262255");
    }
}
