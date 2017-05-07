package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class AbuseReport {
    private String description;

    @Override
    public String toString() {
        return "AbuseReport{" +
                "description='" + description + '\'' +
                '}';
    }

    public AbuseReport(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

