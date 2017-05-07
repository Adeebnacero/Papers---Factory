package za.co.thabo.factory;

import za.co.thabo.domain.*;

import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class ResponseFactory {

    public static Response getResponse(String comment, Date date, String ipaddress, VoteUp voteUp, List<User> user, VoteDown voteDown, List<AbuseReport> report, ContentFilter filter)
    {
        return new Response(comment,date, ipaddress,voteUp, user, voteDown, report, filter);
    }
}
