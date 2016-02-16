package api.impl;

import api.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import ru.shadam.ferry.simple.DefaultClientImplementationFactory;

/**
 * @author sala
 */
public class VKAPIImpl implements VKAPI {
    private final UserOperations userOperations;
    private final GroupOperations groupOperations;
    private final WallOperations wallOperations;
    private final FriendsOperations friendsOperations;

    public VKAPIImpl(String accessToken, HttpClient httpClient, ObjectMapper objectMapper) {
        final DefaultClientImplementationFactory clientImplementationFactory = new DefaultClientImplementationFactory(httpClient, objectMapper);
        clientImplementationFactory.registerImplicitParameterProvider(VKAPI.ACCESS_TOKEN_PROVIDER, new ConstStringProvider(accessToken));
        this.userOperations = clientImplementationFactory.getInterfaceImplementation(UserOperations.class);
        this.groupOperations = clientImplementationFactory.getInterfaceImplementation(GroupOperations.class);
        this.wallOperations = clientImplementationFactory.getInterfaceImplementation(WallOperations.class);
        this.friendsOperations = clientImplementationFactory.getInterfaceImplementation(FriendsOperations.class);
    }

    @Override
    public UserOperations getUserOperations() {
        return userOperations;
    }

    @Override
    public GroupOperations getGroupOperations() {
        return groupOperations;
    }

    @Override
    public WallOperations getWallOperations() {
        return wallOperations;
    }

    @Override
    public FriendsOperations getFriendsOperations() {
        return friendsOperations;
    }
}
