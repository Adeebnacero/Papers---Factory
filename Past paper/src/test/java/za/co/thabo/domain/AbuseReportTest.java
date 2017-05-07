package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class AbuseReportTest extends TestCase {
    @Test
    public void testDescription()
    {
        AbuseReport abuse = new AbuseReport("Rude words");
        assertEquals(abuse.getDescription(), "Rude words");
    }
}
