package dto.wall;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by sala on 16.12.15.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PhotoAttachement.class, name = "photo"),
        @JsonSubTypes.Type(value = DocAttachement.class, name = "doc"),
        @JsonSubTypes.Type(value = AudioAttachement.class, name = "audio"),
        @JsonSubTypes.Type(value = LinkAttachement.class, name = "link"),
        @JsonSubTypes.Type(value = PollAttachement.class, name = "poll"),
        @JsonSubTypes.Type(value = AlbumAttachement.class, name = "album")
})
public abstract class Attachement {

}
