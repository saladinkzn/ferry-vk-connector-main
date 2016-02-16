package api;

import dto.ResponseWrapper;
import dto.User;
import dto.VKList;
import dto.friends.OnlineResponse;
import ru.shadam.ferry.annotations.ImplicitParam;
import ru.shadam.ferry.annotations.Param;
import ru.shadam.ferry.annotations.Url;

import java.util.List;

/**
 * @author sala
 */
@Url(VKAPI.BASE_URL + "friends")
@ImplicitParam(paramName = "v", constValue = VKAPI.VERSION)
public interface FriendsOperations {
    @Url(".get")
    @ImplicitParam(paramName = "access_token", providerName = VKAPI.ACCESS_TOKEN_PROVIDER)
    ResponseWrapper<VKList<Integer>> get();

    @Url(".get")
    @ImplicitParam(paramName = "access_token", providerName = VKAPI.ACCESS_TOKEN_PROVIDER)
    ResponseWrapper<VKList<User>> get(@Param("sort") String sort,
                                      @Param("fields") String fields);

    @Url(".get")
    ResponseWrapper<VKList<Integer>> get(@Param("user_id") String userId);

    @Url(".get")
    ResponseWrapper<VKList<User>> get(@Param("user_id") String userId,
                                      @Param("sort") String sort,
                                      @Param("fields") String fields);

    @Url(".getOnline")
    ResponseWrapper<List<Integer>> getOnline(@Param("user_id") String userId);

    @Url(".getOnline")
    ResponseWrapper<List<Integer>> getOnline(@Param("user_id") String userId,
                                             @Param("list_id") String listId);

    @Url(".getOnline")
    ResponseWrapper<List<Integer>> getOnline(@Param("user_id") String userId,
                                             @Param("list_id") String listId,
                                             @Param("count") int count,
                                             @Param("offset") int offset);

    @Url(".getOnline")
    @ImplicitParam(paramName = "online_mobile", constValue = "1")
    ResponseWrapper<OnlineResponse> getOnlineMobile(@Param("user_id") String userId);

    @Url(".getOnline")
    @ImplicitParam(paramName = "online_mobile", constValue = "1")
    ResponseWrapper<OnlineResponse> getOnlineMobile(@Param("user_id") String userId,
                                                    @Param("list_id") String listId);

    @Url(".getOnline")
    @ImplicitParam(paramName = "online_mobile", constValue = "1")
    ResponseWrapper<OnlineResponse> getOnlineMobile(@Param("user_id") String userId,
                                                    @Param("list_id") String listId,
                                                    @Param("offset") int offset,
                                                    @Param("count") int count);

    @Url(".getMutual")
    ResponseWrapper<List<Integer>> getMutual(@Param("source_uid") int sourceUid,
                                             @Param("target_uid") int targetUid);

    @Url(".getMutual")
    ResponseWrapper<List<Integer>> getMutual(@Param("source_uid") int sourceUid,
                                             @Param("target_uid") int targetUid,
                                             @Param("order") String order,
                                             @Param("count") int count,
                                             @Param("offset") int offset);

    @Url(".getMutual")
    ResponseWrapper<List<Integer>> getMutual(@Param("source_uid") int sourceUid,
                                             @Param("target_uids") String targetUids);

    @Url(".getMutual")
    ResponseWrapper<List<Integer>> getMutual(@Param("source_uid") int sourceUid,
                                             @Param("target_uids") String targetUids,
                                             @Param("order") String order,
                                             @Param("count") int count,
                                             @Param("offset") int offset);

    @Url(".getRecent")
    ResponseWrapper<List<Integer>> getRecent(@Param("count") int count);

}
