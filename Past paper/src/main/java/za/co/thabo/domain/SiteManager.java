package za.co.thabo.domain;

import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class SiteManager {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;
    private String firstName;

    public SiteManager(String email, String firstName, String lastName, String password, List<Role> role, List<Site> site, Contact contact) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
        this.site = site;
        this.contact = contact;
    }

    public List<Role> getRole() {

        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public List<Site> getSite() {
        return site;
    }

    public void setSite(List<Site> site) {
        this.site = site;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    private String lastName;
    private String password;

    //uni directional association
    private List<Role> role;
    private List<Site> site;

    //composition
    private Contact contact;
}
