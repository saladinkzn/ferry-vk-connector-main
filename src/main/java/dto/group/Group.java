package dto.group;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sala
 */
public class Group {
    private long id;
    private String name;
    private String screenName;
    private String type;
    private int isClosed;
    private int isAdmin;
    private int isMember;
    private String description;
    private String photo50;
    private String photo100;
    private String photo200;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @JsonProperty("is_closed")
    public int getIsClosed() {
        return isClosed;
    }

    @JsonProperty("is_closed")
    public void setIsClosed(int isClosed) {
        this.isClosed = isClosed;
    }

    @JsonProperty("is_admin")
    public int getIsAdmin() {
        return isAdmin;
    }

    @JsonProperty("is_admin")
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @JsonProperty("is_member")
    public int getIsMember() {
        return isMember;
    }

    @JsonProperty("is_member")
    public void setIsMember(int isMember) {
        this.isMember = isMember;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("photo_50")
    public String getPhoto50() {
        return photo50;
    }

    @JsonProperty("photo_50")
    public void setPhoto50(String photo50) {
        this.photo50 = photo50;
    }

    @JsonProperty("photo_100")
    public String getPhoto100() {
        return photo100;
    }

    @JsonProperty("photo_100")
    public void setPhoto100(String photo100) {
        this.photo100 = photo100;
    }

    @JsonProperty("photo_200")
    public String getPhoto200() {
        return photo200;
    }

    @JsonProperty("photo_200")
    public void setPhoto200(String photo200) {
        this.photo200 = photo200;
    }


    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", screenName='" + screenName + '\'' +
                ", isClosed=" + isClosed +
                ", isAdmin=" + isAdmin +
                ", isMember=" + isMember +
                ", description='" + description + '\'' +
                ", photo50='" + photo50 + '\'' +
                ", photo100='" + photo100 + '\'' +
                ", photo200='" + photo200 + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
