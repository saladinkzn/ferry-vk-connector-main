package dto.wall;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sala on 16.12.15.
 */
public class Photo {
    private final int id;
    private final int album_id;
    private final int owner_id;
    private final int user_id;
    private final String text;
    private final long date;

    private String photo_75;
    private String photo_130;
    private String photo_604;
    private String photo_807;
    private String photo_1280;
    private String photo_2560;
    private int width;
    private int height;
    private double lat;
    @JsonProperty("long")
    private double longitude;
    private long post_id;
    private String access_key;

    @JsonCreator
    public Photo(@JsonProperty("id") int id,
                 @JsonProperty("album_id") int album_id,
                 @JsonProperty("owner_id") int owner_id,
                 @JsonProperty("user_id") int user_id,
                 @JsonProperty("text") String text,
                 @JsonProperty("date") long date) {
        this.id = id;
        this.album_id = album_id;
        this.owner_id = owner_id;
        this.user_id = user_id;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getText() {
        return text;
    }

    public long getDate() {
        return date;
    }

    public String getPhoto_75() {
        return photo_75;
    }

    public void setPhoto_75(String photo_75) {
        this.photo_75 = photo_75;
    }

    public String getPhoto_130() {
        return photo_130;
    }

    public void setPhoto_130(String photo_130) {
        this.photo_130 = photo_130;
    }

    public String getPhoto_604() {
        return photo_604;
    }

    public void setPhoto_604(String photo_604) {
        this.photo_604 = photo_604;
    }

    public String getPhoto_807() {
        return photo_807;
    }

    public void setPhoto_807(String photo_807) {
        this.photo_807 = photo_807;
    }

    public String getPhoto_1280() {
        return photo_1280;
    }

    public void setPhoto_1280(String photo_1280) {
        this.photo_1280 = photo_1280;
    }

    public String getPhoto_2560() {
        return photo_2560;
    }

    public void setPhoto_2560(String photo_2560) {
        this.photo_2560 = photo_2560;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }

    public String getAccess_key() {
        return access_key;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }


    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", album_id=" + album_id +
                ", owner_id=" + owner_id +
                ", user_id=" + user_id +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", photo_75='" + photo_75 + '\'' +
                ", photo_130='" + photo_130 + '\'' +
                ", photo_604='" + photo_604 + '\'' +
                ", photo_807='" + photo_807 + '\'' +
                ", photo_1280='" + photo_1280 + '\'' +
                ", photo_2560='" + photo_2560 + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", lat=" + lat +
                ", longitude=" + longitude +
                ", post_id=" + post_id +
                ", access_key='" + access_key + '\'' +
                '}';
    }
}
