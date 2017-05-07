package za.co.thabo.domain;

/**
 * Created by thabomoopa on 2017/05/06.
 */
public class Site {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStoryUrl() {
        return storyUrl;
    }

    public void setStoryUrl(String storyUrl) {
        this.storyUrl = storyUrl;
    }

    private String name;
    private String url;
    private String storyUrl;

    public Site(String name, String url, String storyUrl) {
        this.name = name;
        this.url = url;
        this.storyUrl = storyUrl;
    }

    @Override
    public String toString() {
        return "Site{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +

                ", storyUrl='" + storyUrl + '\'' +
                '}';
    }
}
