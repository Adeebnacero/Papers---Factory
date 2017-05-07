package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class ContentFilter {
    private String contentCheck;

    public String getContentCheck() {
        return contentCheck;
    }

    public void setContentCheck(String contentCheck) {
        this.contentCheck = contentCheck;
    }

    @Override
    public String toString() {
        return "ContentFilter{" +
                "contentCheck='" + contentCheck + '\'' +
                '}';
    }
}
