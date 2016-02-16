package api.impl;

import api.GroupOperations;
import api.UserOperations;
import api.VKAPI;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import ru.shadam.ferry.simple.DefaultClientImplementationFactory;

/**
 * @author sala
 */
public class VKAPIImpl implements VKAPI {
    private final UserOperations userOperations;
    private final GroupOperations groupOperations;

    public VKAPIImpl(String accessToken, HttpClient httpClient, ObjectMapper objectMapper) {
        final DefaultClientImplementationFactory clientImplementationFactory = new DefaultClientImplementationFactory(httpClient, objectMapper);
        clientImplementationFactory.registerImplicitParameterProvider(VKAPI.ACCESS_TOKEN_PROVIDER, new ConstStringProvider(accessToken));
        this.userOperations = clientImplementationFactory.getInterfaceImplementation(UserOperations.class);
        this.groupOperations = clientImplementationFactory.getInterfaceImplementation(GroupOperations.class);
    }

    @Override
    public UserOperations getUserOperations() {
        return userOperations;
    }

    @Override
    public GroupOperations getGroupOperations() {
        return groupOperations;
    }
}
