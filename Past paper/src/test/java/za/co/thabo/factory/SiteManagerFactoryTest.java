package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Contact;
import za.co.thabo.domain.Role;
import za.co.thabo.domain.Site;
import za.co.thabo.domain.SiteManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class SiteManagerFactoryTest extends TestCase {

    List<Role> role = new ArrayList<Role>();
    Role role1 = new Role("Manager", "Department Manager");

    List<Site> sites = new ArrayList<Site>();
    Site site1 = new Site("madEvil","www.deathThread.co.za", "megaDeath");

    Contact contact = new Contact("0849262255", "1488 Block L", "0152");

    //Implementing the Factory on SiteManager
    SiteManager siteManager = SiteManagerFactory.getSiteManager("thabo.moopa@gmail.com",
            "Thabo", "Moopa", "207801", role, sites, contact);

    @Test
    public void testFactoryEmail() {
        assertTrue(siteManager.getEmail().equalsIgnoreCase("thabo.moopa@gmail.com"));
    }

    @Test
    public void testFactoryFirstName() {
        assertEquals(siteManager.getFirstName(), "Thabo");
    }

    @Test
    public void testFactoryLastName() {
        assertTrue(siteManager.getLastName().equalsIgnoreCase("Moopa"));
    }

    @Test
    public void testFactoryPassword() {
        assertTrue(siteManager.getPassword().contains("207801"));
    }

    @Test
    public void testFactoryRoleName() {
        role.add(role1);
        assertEquals(siteManager.getRole().get(0).getName(),"Manager");
    }
    @Test
    public void testFactoryRoleDescription()
    {
        role.add(role1);
        assertEquals(siteManager.getRole().get(0).getDescription(), "Department Manager");
    }

    @Test
    public void testFactorySiteName() {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getName(), "madEvil");
    }
    @Test
    public void testFactorySiteUrl()
    {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getUrl(), "www.deathThread.co.za");
    }

    @Test
    public void testFactorySiteStoryUrl()
    {
        sites.add(site1);
        assertEquals(siteManager.getSite().get(0).getStoryUrl(), "megaDeath");
    }

    @Test
    public void testFactoryAddress() {
        assertEquals(siteManager.getContact().getAddress(), "1488 Block L");
    }

    @Test
    public void testFactoryCellphone() {
        assertEquals(siteManager.getContact().getCellphone(), "0849262255");
    }

    @Test
    public void testFactoryPostalCode() {
        assertEquals(siteManager.getContact().getPostalCode(), "0152");
    }

}
