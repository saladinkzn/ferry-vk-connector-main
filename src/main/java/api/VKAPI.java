package api;

/**
 * @author sala
 */
public interface VKAPI {
    String VERSION = "5.45";
    String BASE_URL = "https://api.vk.com/method/groups";
    String ACCESS_TOKEN_PROVIDER = "accessTokenProvider";

    UserOperations getUserOperations();

    GroupOperations getGroupOperations();
}
