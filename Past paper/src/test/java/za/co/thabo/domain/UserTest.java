package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class UserTest extends TestCase{

    Date date = new Date();
    Reputation rep = new Reputation(date, 5);
    List<Reputation> reputation = new ArrayList<Reputation>();


    User user = new User("thabo.moopa@gmail.com", "Thabo", "20701", "Registered", reputation);

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
        reputation.add(rep);
        assertEquals(user.getReputation().get(0).getDate(), date);
    }
    @Test
    public void testReputationValue()
    {
        reputation.add(rep);
        assertEquals(user.getReputation().get(0).getValue(), 5);
    }

}
