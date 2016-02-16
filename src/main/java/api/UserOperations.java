package api;

import dto.ResponseWrapper;
import dto.User;
import dto.VKList;
import ru.shadam.ferry.annotations.ImplicitParam;
import ru.shadam.ferry.annotations.Param;
import ru.shadam.ferry.annotations.Url;

import java.util.List;

/**
 * @author sala
 */
@Url("https://api.vk.com/method/users")
@ImplicitParam(paramName = "v", constValue = VKAPI.VERSION)
public interface UserOperations {
    @Url(".get")
    ResponseWrapper<List<User>> get(@Param("user_ids") String userIds);

    @Url(".search")
    @ImplicitParam(paramName = "access_token", providerName = "accessTokenProvider")
    VKList<User> search(@Param("q") String q);
}
