package za.co.thabo.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class User implements Serializable, Comparable<User> {
private String email;
private String screenName;
private List<Reputation> reputation;

public String getEmail() {
        return email;
        }

public void setEmail(String email) {
            this.email = email;
        }

public String getScreenName() {
        return screenName;
        }

public void setScreenName(String screenName) {
        this.screenName = screenName;
        }

public String getPassword() {
        return password;
        }

public void setPassword(String password) {
        this.password = password;
        }

public String getStatus() {
        return status;
        }

public void setStatus(String status) {
        this.status = status;
        }

private String password;
private String status;



    public int compareTo(User user) {
        return email.compareTo(user.email);
        }

    public User(String email, String screenName, String password, String status, List<Reputation> reputation) {
        this.email = email;
        this.screenName = screenName;
        this.reputation = reputation;
        this.password = password;
        this.status = status;
    }

    public List<Reputation> getReputation() {

        return reputation;
    }

    public void setReputation(List<Reputation> reputation) {
        this.reputation = reputation;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", screenName='" + screenName + '\'' +
                ", reputation=" + reputation +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
