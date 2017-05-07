package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class SiteManagerTest extends TestCase {

    List<Role> role = new ArrayList<Role>();
    Role role1 = new Role("Manager", "Department Manager");

    List<Site> sites = new ArrayList<Site>();
    Site site1 = new Site("madEvil", "www.deathThread.co.za", "megaDeath");

    Contact contact = new Contact("0849262255", "1488 Block L", "0152");

    SiteManager siteManager = new SiteManager("thabo.moopa@gmail.com",
            "Thabo", "Moopa", "207801", role, sites, contact);


    @Test
    public void testEmail() {
        assertTrue(siteManager.getEmail().equalsIgnoreCase("thabo.moopa@gmail.com"));
    }

    @Test
    public void testFirstName() {
        assertEquals(siteManager.getFirstName(), "Thabo");
    }

    @Test
    public void testLastName() {
        assertTrue(siteManager.getLastName().equalsIgnoreCase("Moopa"));
    }

    @Test
    public void testPassword() {
        assertTrue(siteManager.getPassword().contains("207801"));
    }

    @Test
    public void testRoleName() {
        role.add(role1);
        assertEquals(siteManager.getRole().get(0).getName(),"Manager");
    }
    @Test
    public void testRoleDescription()
    {
        role.add(role1);
        assertEquals(siteManager.getRole().get(0).getDescription(), "Department Manager");
    }

    @Test
    public void testSiteName() {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getName(), "madEvil");
    }
    @Test
    public void testSiteUrl()
    {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getUrl(), "www.deathThread.co.za");
    }

    @Test
    public void testSiteStoryUrl()
    {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getStoryUrl(), "megaDeath");
    }

    @Test
    public void testAddress() {
        assertEquals(siteManager.getContact().getAddress(), "1488 Block L");
    }

    @Test
    public void testCellphone() {
        assertEquals(siteManager.getContact().getCellphone(), "0849262255");
    }

    @Test
    public void testPostalCode() {
        assertEquals(siteManager.getContact().getPostalCode(), "0152");
    }
}

