package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class CommentTest extends TestCase {
    Date date = new Date();


    List<Reputation> rep = new ArrayList<Reputation>();
    Reputation reputation = new Reputation(date, 5);

    List<Site> sites = new ArrayList<Site>();
    Site site1 = new Site("madEvil","www.deathThread.co.za", "megaDeath");

    VoteUp voteUp = new VoteUp(1);

    VoteDown voteDown = new VoteDown(2);

    List<User> users = new ArrayList<User>();
    User user = new User("thabo.moopa@gmail.com", "Thabo", "20701", "Registered", rep);

    List<AbuseReport> report = new ArrayList<AbuseReport>();
    AbuseReport abuse1 = new AbuseReport("Rude words");

    ContentFilter filter = new ContentFilter();

    List<Response> response = new ArrayList<Response>();
    Response respond1 = new Response("I know you do", date, "192.168.15.28", voteUp, users, voteDown,report, filter );


    Comment comment = new Comment("Yes I like this", date, "192.168.15.29", users, sites, voteUp, voteDown, report, response,filter );

    @Test
    public void testComment()
    {
        assertEquals(comment.getComment(), "Yes I like this");
    }
    @Test
    public void testDate()
    {
        assertEquals(comment.getDate(), date);
    }
    @Test
    public void testIP()
    {
        assertEquals(comment.getIpaddress(), "192.168.15.29");
    }
    @Test
    public void testUserName()
    {
        users.add(user);
        assertEquals(comment.getUser().get(0).getScreenName(), "Thabo");
    }
    @Test
    public void testUserEmail()
    {
        users.add(user);
        assertEquals(comment.getUser().get(0).getEmail(), "thabo.moopa@gmail.com");
    }
    @Test
    public void testUserPassword()
    {
        users.add(user);
        assertEquals(comment.getUser().get(0).getPassword(), "20701");
    }
    @Test
    public void testUserStatus()
    {
        users.add(user);
        assertEquals(comment.getUser().get(0).getStatus(), "Registered");
    }
    @Test
    public void testUserReputationDate()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(comment.getUser().get(0).getReputation().get(0).getDate(), date);
    }
    @Test
    public void testUserReputationValue()
    {
        users.add(user);
        rep.add(reputation);
        assertEquals(comment.getUser().get(0).getReputation().get(0).getValue(),5);
    }
    @Test
    public void testSiteName()
    {
        sites.add(site1);
        assertEquals(comment.getSite().get(0).getName(), "madEvil");
    }
    @Test
    public void testSiteUrl()
    {
        sites.add(site1);
        assertEquals(comment.getSite().get(0).getUrl(), "www.deathThread.co.za");
    }
    @Test
    public void testSiteStoryUrl()
    {
        sites.add(site1);
        assertEquals(comment.getSite().get(0).getStoryUrl(), "megaDeath");
    }
    @Test
    public void testVoteUp()
    {
        //comment.setVoteDown();
        assertEquals(comment.getVoteUp().getCounter(), 1);
    }
    @Test
    public void testVoteDown()
    {
        assertEquals(comment.getVoteDown().getCounter(),2);
    }
    @Test
    public void testAbuseReportDescription()
    {
        report.add(abuse1);
        assertEquals(comment.getReport().get(0).getDescription(),"Rude words" );
    }
    @Test
    public void testResponseComment()
    {
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getComment(),"I know you do" );
    }
    @Test
    public void testResponseDate()
    {
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getDate(),date );
    }
    @Test
    public void testResponseIpAddress()
    {
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getIpaddress(),"192.168.15.28");
    }
    @Test
    public void testResponseVoteUp()
    {

        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getVoteUp().getCounter(),1);
    }
    @Test
    public void testResponseVoteDown()
    {
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getVoteDown().getCounter(),2);
    }
    @Test
    public void testResponseUserEmail()
    {
        users.add(user);
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getEmail(),"thabo.moopa@gmail.com");
    }
    @Test
    public void testResponseUserName()
    {
        users.add(user);
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getScreenName(),"thabo");
    }
    @Test
    public void testResponseUserPassword()
    {
        users.add(user);
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getPassword(),"20701");
    }
    @Test
    public void testResponseUserStatus()
    {
        users.add(user);
        response.add(respond1);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getStatus(),"Registered");
    }
    @Test
    public void testResponseUserReputationDate()
    {
        users.add(user);
        response.add(respond1);
        rep.add(reputation);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getReputation().get(0).getDate(),date);
    }
    @Test
    public void testResponseUserReputationValue()
    {
        users.add(user);
        response.add(respond1);
        rep.add(reputation);
        assertEquals(comment.getResponse().get(0).getUser().get(0).getReputation().get(0).getValue(),5);
    }

    @Test
    public void testFilter()
    {
        filter.setContentCheck("Warning");
        assertEquals(comment.getFilter().getContentCheck(), "Warning");
    }

}
