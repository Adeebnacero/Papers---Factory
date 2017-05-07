package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Reputation;

import java.util.Date;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class ReputationFactoryTest extends TestCase {

    Date date = new Date();

    Reputation reputation = ReputationFactory.createReputation(date, 4);

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
