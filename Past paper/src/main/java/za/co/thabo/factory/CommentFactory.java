package za.co.thabo.factory;

import za.co.thabo.domain.*;

import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class CommentFactory {
    private CommentFactory ()
    {

    }

    public static Comment getComment(String comment, Date date, String ipaddress, List<User> user, List<Site> site, VoteUp voteUp, VoteDown voteDown, List<AbuseReport> report, List<Response> response, ContentFilter filter)
    {
        return new Comment(comment, date, ipaddress, user, site, voteUp, voteDown, report, response, filter);
    }

}
