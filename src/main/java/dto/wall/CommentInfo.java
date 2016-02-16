package dto.wall;

/**
 * @author sala
 */
public class CommentInfo {
    private int count;
    private Integer canPost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }


    @Override
    public String toString() {
        return "CommentInfo{" +
                "count=" + count +
                ", canPost=" + canPost +
                '}';
    }
}
