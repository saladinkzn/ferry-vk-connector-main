package dto.wall;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author sala
 */
public class Post {
    private int id;
    @JsonProperty("owner_id")
    private int ownerId;
    @JsonProperty("from_id")
    private int fromId;
    private long date;
    private String text;
    @JsonProperty("reply_owner_id")
    private Integer replyOwnerId;
    @JsonProperty("reply_post_id")
    private Integer replyPostId;
    @JsonProperty("friends_only")
    private int frendsOnly;
    private CommentInfo comments;
    private LikeInfo likes;
    private RepostInfo reposts;
    @JsonProperty("post_type")
    private String postType;
    @JsonProperty("post_source")
    private PostSource postSource;
    private List<Attachement> attachments;
    private GeoInfo geo;
    @JsonProperty("signer_id")
    private Integer signerId;
    @JsonProperty("copy_history")
    private List<Post> copyHistory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(Integer replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public Integer getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(Integer replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFrendsOnly() {
        return frendsOnly;
    }

    public void setFrendsOnly(int frendsOnly) {
        this.frendsOnly = frendsOnly;
    }

    public CommentInfo getComments() {
        return comments;
    }

    public void setComments(CommentInfo comments) {
        this.comments = comments;
    }

    public LikeInfo getLikes() {
        return likes;
    }

    public void setLikes(LikeInfo likes) {
        this.likes = likes;
    }

    public RepostInfo getReposts() {
        return reposts;
    }

    public void setReposts(RepostInfo reposts) {
        this.reposts = reposts;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public List<Attachement> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachement> attachments) {
        this.attachments = attachments;
    }

    public GeoInfo getGeo() {
        return geo;
    }

    public void setGeo(GeoInfo geo) {
        this.geo = geo;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public void setSignerId(Integer signerId) {
        this.signerId = signerId;
    }

    public List<Post> getCopyHistory() {
        return copyHistory;
    }

    public void setCopyHistory(List<Post> copyHistory) {
        this.copyHistory = copyHistory;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", fromId=" + fromId +
                ", date=" + date +
                ", text='" + text + '\'' +
                ", replyOwnerId=" + replyOwnerId +
                ", replyPostId=" + replyPostId +
                ", frendsOnly=" + frendsOnly +
                ", comments=" + comments +
                ", likes=" + likes +
                ", reposts=" + reposts +
                ", postType='" + postType + '\'' +
                ", postSource=" + postSource +
                ", attachments=" + attachments +
                ", geo=" + geo +
                ", signerId=" + signerId +
                ", copyHistory=" + copyHistory +
                '}';
    }
}
