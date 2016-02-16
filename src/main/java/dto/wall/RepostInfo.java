package dto.wall;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sala
 */
public class RepostInfo {
    private int count;
    @JsonProperty("user_reposted")
    private Integer userReposted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }


    @Override
    public String toString() {
        return "RepostInfo{" +
                "count=" + count +
                ", userReposted=" + userReposted +
                '}';
    }
}
