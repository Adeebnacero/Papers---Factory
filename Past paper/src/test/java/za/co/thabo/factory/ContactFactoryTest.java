package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Contact;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ContactFactoryTest extends TestCase {

    Contact contact = ContactFactory.getContact("0849262255", "1488 Block L", "0152");
    @Test
    public void testFactoryContactAddress()
    {
        assertEquals(contact.getAddress(), "1488 Block L");
    }
    @Test
    public void testFactoryContactPostalCode()
    {
        assertEquals(contact.getPostalCode(), "0152");
    }
    @Test
    public void testFactoryCellphone()
    {
        assertEquals(contact.getCellphone(), "0849262255");
    }
}
