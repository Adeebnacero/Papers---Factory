package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Reputation;
import za.co.thabo.domain.User;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class UserFactoryTest extends TestCase {
    Date date = new Date();



    List<Reputation> rep = new ArrayList<Reputation>();
    Reputation reputation = new Reputation(date, 3);

    User user = UserFactory.getUser("thabo.moopa@gmail.com", "Thabo", "20701", "Registered", rep);

    @Test
    public void testUserEmail()
    {
        assertEquals(user.getEmail(), "thabo.moopa@gmail.com");
    }
    @Test
    public void testName()
    {
        assertEquals(user.getScreenName(), "Thabo");
    }
    @Test
    public void testPassword()
    {
        assertEquals(user.getPassword(), "20701");
    }
    @Test
    public void testStatus()
    {
        assertEquals(user.getStatus(), "Registered");
    }
    @Test
    public void testReputationDate()
    {
        rep.add(reputation);
        assertEquals(user.getReputation().get(0).getDate(), date);
    }
    @Test
    public void testReputationValue()
    {
        rep.add(reputation);
        assertEquals(user.getReputation().get(0).getValue(), 3);
    }
}
