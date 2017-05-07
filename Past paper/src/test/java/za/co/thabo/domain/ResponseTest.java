package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ResponseTest extends TestCase {
    Date date = new Date();

    VoteUp voteUp = new VoteUp(1);

    VoteDown voteDown = new VoteDown(2);
    List<Reputation> rep = new ArrayList<Reputation>();
    Reputation reputation = new Reputation(date, 5);

    List<AbuseReport> AbuseReport = new ArrayList<AbuseReport>();
    AbuseReport abuseReport = new AbuseReport("Rude words");

    List<User> users = new ArrayList<User>();
    User user = new User("thabo.moopa@gmail.com",
            "Thabo",
            "20701",
            "Registered",
            rep);
    ContentFilter contentFilter = new ContentFilter();
    Response response = new Response("I know you do", date, "192.168.15.28",
            voteUp,
            users,
            voteDown,
            AbuseReport,
            contentFilter );

    @Test
    public void testResponseComment()
    {
        assertEquals(response.getComment(), "I know you do");
    }
    @Test
    public void testResponseDate()
    {
        assertEquals(response.getDate(), date);
    }
    @Test
    public void testResponseIpAddress()
    {
        assertEquals(response.getIpaddress(), "192.168.15.28");
    }
    @Test
    public void testResponseVoteUp()
    {
        assertEquals(response.getVoteUp().getCounter(), 1);
    }
    @Test
    public void testResponseVoteDown()
    {
        assertEquals(response.getVoteDown().getCounter(), 2);
    }
    @Test
    public void testResponseUserEmail()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getEmail(), "thabo.moopa@gmail.com");

    }
    @Test
    public void testResponseUserName()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getScreenName(), "Thabo");

    }
    @Test
    public void testResponseUserPassword()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getPassword(), "20701");
    }
    @Test
    public void testResponseUserStatus()
    {
        users.add(user);
        assertEquals(response.getUser().get(0).getStatus(), "Registered");
    }
    @Test
    public void testResponseUserReputationDate()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(response.getUser().get(0).getReputation().get(0).getDate(), date);
    }
    @Test
    public void testResponseUserReputationValue()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(response.getUser().get(0).getReputation().get(0).getValue(), 5);
    }
    @Test
    public void testResponseAbuseReport()
    {
        AbuseReport.add(abuseReport);
        assertEquals(response.getReport().get(0).getDescription(), "Rude words");
    }
    @Test
    public void testResponseContentFilter()
    {
        contentFilter.setContentCheck("Warning");
        assertEquals(response.getFilter().getContentCheck(), "Warning");
    }


}
