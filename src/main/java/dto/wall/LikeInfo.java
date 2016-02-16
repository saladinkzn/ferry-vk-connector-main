package dto.wall;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sala
 */
public class LikeInfo {
    private int count;
    @JsonProperty("user_like")
    private int userLikes;
    @JsonProperty("can_like")
    private int canLike;
    @JsonProperty("can_publish")
    private int canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
