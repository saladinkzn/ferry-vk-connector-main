package dto.wall;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by sala on 16.12.15.
 */
public class PhotoAttachement extends Attachement {
    private final Photo photo;

    @JsonCreator
    public PhotoAttachement(@JsonProperty("photo") Photo photo) {
        this.photo = photo;
    }

    public Photo getPhoto() {
        return photo;
    }


    @Override
    public String toString() {
        return "PhotoAttachement{" +
                "photo=" + photo +
                '}';
    }
}
