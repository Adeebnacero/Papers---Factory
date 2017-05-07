package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Site;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class SiteFactoryTest extends TestCase {

    Site site = SiteFactory.getSite("madEvil","www.deathThread.co.za", "megaDeath");

    @Test
    public void testFactorySiteName()
    {
        assertEquals(site.getName(), "madEvil");
    }
    @Test
    public void testFactorySiteStoryUrl()
    {
        assertEquals(site.getStoryUrl(), "megaDeath");
    }
    @Test
    public void testFactorySiteUrl()
    {
        assertEquals(site.getUrl(), "www.deathThread.co.za");
    }
}
