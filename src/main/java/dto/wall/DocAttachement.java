package dto.wall;

import com.fasterxml.jackson.annotation.JsonAnySetter;

/**
 * Created by sala on 16.12.15.
 */
public class DocAttachement extends Attachement {
    @JsonAnySetter
    public void setObject(String name, Object val) {

    }
}
