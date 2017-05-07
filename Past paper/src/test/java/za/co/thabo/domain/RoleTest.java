package za.co.thabo.domain;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class RoleTest extends TestCase {
    Role role = new Role("Manager", "Department Manager");
    @Test
    public void testRoleName()
    {
        assertEquals(role.getName(), "Manager");
    }
    @Test
    public void testRoleDescription()
    {
        assertEquals(role.getDescription(), "Department Manager");
    }

}
