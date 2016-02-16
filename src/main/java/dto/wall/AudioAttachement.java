package dto.wall;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sala
 */
public class AudioAttachement extends Attachement {
    private Audio audio;

    @JsonCreator
    public AudioAttachement(@JsonProperty("audio") Audio audio) {
        this.audio = audio;
    }

    public Audio getAudio() {
        return audio;
    }
}
