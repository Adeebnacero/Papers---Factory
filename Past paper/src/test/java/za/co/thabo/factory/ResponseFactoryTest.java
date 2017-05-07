package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ResponseFactoryTest extends TestCase {
    Date date = new Date();

    VoteUp voteUp = new VoteUp(1);

    VoteDown voteDown = new VoteDown(2);
    List<Reputation> rep = new ArrayList<Reputation>();
    Reputation reputation = new Reputation(date, 5);

    List<za.co.thabo.domain.AbuseReport> AbuseReport = new ArrayList<AbuseReport>();
    AbuseReport abuseReport = new AbuseReport("Rude words");

    List<User> users = new ArrayList<User>();
    User user = new User("thabo.moopa@gmail.com",
            "Thabo",
            "20701",
            "Registered",
            rep);
    ContentFilter contentFilter = new ContentFilter();
    Response response = ResponseFactory.getResponse("I know you do", date, "192.168.15.28",
            voteUp,
            users,
            voteDown,
            AbuseReport,
            contentFilter );

    @Test
    public void testFactoryResponseComment()
    {
        assertEquals(response.getComment(), "I know you do");
    }
    @Test
    public void testFactoryResponseDate()
    {
        assertEquals(response.getDate(), date);
    }
    @Test
    public void testFactoryResponseIpAddress()
    {
        assertEquals(response.getIpaddress(), "192.168.15.28");
    }
    @Test
    public void testFactoryResponseVoteUp()
    {
        assertEquals(response.getVoteUp().getCounter(), 1);
    }
    @Test
    public void testFactoryResponseVoteDown()
    {
        assertEquals(response.getVoteDown().getCounter(), 2);
    }
    @Test
    public void testFactoryResponseUserEmail()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getEmail(), "thabo.moopa@gmail.com");

    }
    @Test
    public void testFactoryResponseUserName()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getScreenName(), "Thabo");

    }
    @Test
    public void testFactoryResponseUserPassword()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getPassword(), "20701");
    }
    @Test
    public void testFactoryResponseUserStatus()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getStatus(), "Registered");
    }
    @Test
    public void testFactoryResponseUserReputationDate()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(response.getUser().get(0).getReputation().get(0).getDate(), date);
    }
    @Test
    public void testFactoryResponseUserReputationValue()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(response.getUser().get(0).getReputation().get(0).getValue(), 5);
    }
    @Test
    public void testFactoryResponseAbuseReport()
    {
        AbuseReport.add(abuseReport);
        assertEquals(response.getReport().get(0).getDescription(), "Rude words");
    }
    @Test
    public void testFactoryResponseContentFilter()
    {
        contentFilter.setContentCheck("Warning");
        assertEquals(response.getFilter().getContentCheck(), "Warning");
    }
}
