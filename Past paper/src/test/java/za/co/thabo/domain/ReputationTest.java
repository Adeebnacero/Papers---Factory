package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class ReputationTest extends TestCase {

    Date date = new Date();

    Reputation reputation = new Reputation(date, 4);

    @Test
    public void testDate()
    {
        assertEquals(reputation.getDate(), date);
    }
    @Test
    public void testValue()
    {
        assertEquals(reputation.getValue(), 4);
    }
}
