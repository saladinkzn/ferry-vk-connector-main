package dto.friends;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author sala
 */
public class OnlineResponse {
    private List<Integer> online;
    @JsonProperty("online_mobile")
    private List<Integer> onlineMobile;
}
