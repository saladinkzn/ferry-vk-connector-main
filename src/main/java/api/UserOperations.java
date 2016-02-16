package api;

import dto.ResponseWrapper;
import dto.User;
import dto.VKList;
import dto.group.Group;
import dto.user.UserAndGroupIds;
import ru.shadam.ferry.annotations.ImplicitParam;
import ru.shadam.ferry.annotations.Param;
import ru.shadam.ferry.annotations.Url;

import java.util.List;

/**
 * @author sala
 */
@Url(VKAPI.BASE_URL + "users")
@ImplicitParam(paramName = "v", constValue = VKAPI.VERSION)
public interface UserOperations {
    @Url(".get")
    ResponseWrapper<List<User>> get(@Param("user_ids") String userIds);

    @Url(".search")
    @ImplicitParam(paramName = "access_token", providerName = "accessTokenProvider")
    ResponseWrapper<VKList<User>> search(@Param("q") String q);

    @Url(".getSubscriptions")
    ResponseWrapper<UserAndGroupIds> getSubscriptions(@Param("user_id") String userId);

    @Url(".getSubscriptions")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<Group> getSubscriptions(@Param("user_id") String userId,
                                            @Param("offset") int offset,
                                            @Param("count") int count,
                                            @Param("fields") String fields);

    @Url(".getFollowers")
    ResponseWrapper<VKList<User>> getFollowers(@Param("user_id") String userId,
                                               @Param("offset") int offset,
                                               @Param("count") int count);

    @Url(".getFollowers")
    ResponseWrapper<VKList<User>> getFollowers(@Param("user_id") String userId,
                                               @Param("offset") int offset,
                                               @Param("count") int count,
                                               @Param("fields") String fields);

    @Url(".getFollowers")
    ResponseWrapper<VKList<User>> getFollowers(@Param("user_id") String userId,
                                               @Param("offset") int offset,
                                               @Param("count") int count,
                                               @Param("fields") String fields,
                                               @Param("name_case") String nameCase);
}
