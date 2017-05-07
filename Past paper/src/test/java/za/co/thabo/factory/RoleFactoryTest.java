package za.co.thabo.factory;

import junit.framework.TestCase;
import org.junit.Test;
import za.co.thabo.domain.Role;

/**
 * Created by thabomoopa on 2017/05/07.
 */
public class RoleFactoryTest extends TestCase {

    Role role = RoleFactory.getRole("Manager", "Department Manager");
    @Test
    public void testFactoryRoleName()
    {
        assertEquals(role.getName(), "Manager");
    }
    @Test
    public void testFactoryRoleDescription()
    {
        assertEquals(role.getDescription(), "Department Manager");
    }
}
