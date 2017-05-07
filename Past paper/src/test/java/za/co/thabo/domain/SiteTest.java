package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class SiteTest extends TestCase {
    Site site = new Site("madEvil","www.deathThread.co.za", "megaDeath");
    @Test
    public void testSiteName()
    {
      assertEquals(site.getName(), "madEvil");
    }
    @Test
    public void testSiteStoryUrl()
    {
        assertEquals(site.getStoryUrl(), "megaDeath");
    }
    @Test
    public void testSiteUrl()
    {
        assertEquals(site.getUrl(), "www.deathThread.co.za");
    }
}
