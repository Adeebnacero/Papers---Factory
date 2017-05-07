package za.co.thabo.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class Comment {
    //uni directional association
    private List<User> user;
    private List<Site> site;
    private VoteUp voteUp;
    private VoteDown voteDown;

    //Aggregation
    private List<AbuseReport> report;
    private List<Response> response;

    //Composition
    private ContentFilter filter = new ContentFilter();

    //variables in the class
    private String comment;
    private Date date;
    private String ipaddress;

    @Override
    public String toString() {
        return "Comment{" +
                "user=" + user +
                ", site=" + site +
                ", voteUp=" + voteUp +
                ", voteDown=" + voteDown +
                ", report=" + report +
                ", response=" + response +
                ", filter=" + filter +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", ipaddress='" + ipaddress + '\'' +
                '}';
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Site> getSite() {
        return site;
    }

    public void setSite(List<Site> site) {
        this.site = site;
    }

    public VoteUp getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(VoteUp voteUp) {
        this.voteUp = voteUp;
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

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
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

    public Comment(String comment, Date date, String ipaddress, List<User> user, List<Site> site, VoteUp voteUp, VoteDown voteDown, List<AbuseReport> report, List<Response> response, ContentFilter filter) {
        this.user = user;
        this.site = site;
        this.voteUp = voteUp;
        this.voteDown = voteDown;
        this.report = report;
        this.response = response;
        this.filter = filter;
        this.comment = comment;
        this.date = date;
        this.ipaddress = ipaddress;
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
}

