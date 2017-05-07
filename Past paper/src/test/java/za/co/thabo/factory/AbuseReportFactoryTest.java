package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.AbuseReport;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class AbuseReportFactoryTest extends TestCase {

    AbuseReport abuse = AbuseReportFactory.getReport("Rude words");
    @Test
    public void testFactoryDescription()
    {

        assertEquals(abuse.getDescription(), "Rude words");
    }
}
