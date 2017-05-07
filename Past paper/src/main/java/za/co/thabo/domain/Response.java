package za.co.thabo.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class Response {
    //uni directional association
    private VoteUp voteUp;
    private List<User> user;
    private VoteDown voteDown;

    //Aggregation
    private List<AbuseReport> report;


    //composition
    private ContentFilter filter = new ContentFilter();

    public VoteUp getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(VoteUp voteUp) {
        this.voteUp = voteUp;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public VoteDown getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(VoteDown voteDown) {
        this.voteDown = voteDown;
    }

    public List<AbuseReport> getReport() {
        return report;
    }

    public void setReport(List<AbuseReport> report) {
        this.report = report;
    }

    public ContentFilter getFilter() {
        return filter;
    }

    public void setFilter(ContentFilter filter) {
        this.filter = filter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Response(String comment, Date date, String ipaddress,VoteUp voteUp, List<User> user, VoteDown voteDown, List<AbuseReport> report, ContentFilter filter) {

        this.voteUp = voteUp;
        this.user = user;
        this.voteDown = voteDown;
        this.report = report;
        this.filter = filter;
        this.comment = comment;
        this.date = date;
        this.ipaddress = ipaddress;
    }

    private String comment;
    private Date date;
    private String ipaddress;
}
