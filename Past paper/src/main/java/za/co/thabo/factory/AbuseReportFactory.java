package za.co.thabo.factory;

import za.co.thabo.domain.AbuseReport;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class AbuseReportFactory {
    private AbuseReportFactory()
    {

    }
    public static AbuseReport getReport(String description)
    {
        return new AbuseReport(description);
    }
}
