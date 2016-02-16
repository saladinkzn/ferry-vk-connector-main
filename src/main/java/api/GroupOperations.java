package api;

import dto.ResponseWrapper;
import dto.VKList;
import dto.group.Group;
import dto.group.Membership;
import ru.shadam.ferry.annotations.ImplicitParam;
import ru.shadam.ferry.annotations.Param;
import ru.shadam.ferry.annotations.Url;

import java.util.List;

/**
 * @author sala
 */
@Url(VKAPI.BASE_URL + "groups")
@ImplicitParam(paramName = "v", constValue = VKAPI.VERSION)
public interface GroupOperations {

    @Url(".isMember")
    ResponseWrapper<Integer> groupsIsMember(@Param("group_id") String groupId,
                                            @Param("user_id") String userId);

    @Url(".isMember")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<Membership> groupsIsMemberExtended(@Param("group_id") String groupId,
                                                       @Param("user_id") String userId);

    @Url(".isMember")
    ResponseWrapper<List<Membership>> groupsIsMemberByList(@Param("group_id") String groupId,
                                                           @Param("user_ids") String userIds);

    @Url(".getById")
    ResponseWrapper<List<Group>> groupsGetById(@Param("group_id") String groupId);

    @Url(".getById")
    ResponseWrapper<List<Group>> groupsGetByIdFields(@Param("group_id") String groupId,
                                                     @Param("fields") String fields);

    @Url(".getById")
    ResponseWrapper<List<Group>> groupsGetByIds(@Param("group_ids") String groupIds);

    @Url(".getById")
    ResponseWrapper<List<Group>> groupsGetByIdsFields(@Param("group_ids") String groupIds,
                                                      @Param("fields") String fields);

    @Url(".get")
    ResponseWrapper<VKList<Integer>> get();

    @Url(".get")
    ResponseWrapper<VKList<Integer>> get(@Param("offset") int offset,
                                         @Param("count") int count);

    @Url(".get")
    ResponseWrapper<VKList<Integer>> get(@Param("user_id") String userId);

    @Url(".get")
    ResponseWrapper<VKList<Integer>> get(@Param("user_id") String userId,
                                         @Param("offset") int offset,
                                         @Param("count") int count);

    @Url(".get")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<VKList<Group>> getExtended();

    @Url(".get")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<VKList<Group>> getExtended(@Param("user_id") String userId);

    @Url(".get")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<VKList<Group>> getExtended(@Param("user_id") String userId,
                                               @Param("fields") String fields);

    @Url(".get")
    @ImplicitParam(paramName = "extended", constValue = "1")
    ResponseWrapper<VKList<Group>> getExtended(@Param("user_id") String userId,
                                               @Param("fields") String fields,
                                               @Param("offset") int offset,
                                               @Param("count") int count);

    @Url(".getMembers")
    ResponseWrapper<VKList<Integer>> getMembers(@Param("group_id") String groupId);

    @Url(".getMembers")
    ResponseWrapper<VKList<Group>> getMembers(@Param("group_id") String groupId,
                                              @Param("fields") String fields);

    @Url(".getMembers")
    ResponseWrapper<VKList<Group>> getMembers(@Param("group_id") String groupId,
                                              @Param("sort") String sort,
                                              @Param("offset") int offset,
                                              @Param("count") int count,
                                              @Param("fields") String fields);

    @Url(".getMembers")
    ResponseWrapper<VKList<Integer>> getMembers(@Param("group_id") String groupId,
                                                @Param("sort") String sort,
                                                @Param("offset") int offset,
                                                @Param("count") int count);

    @Url(".search")
    @ImplicitParam(paramName = "access_token", providerName = VKAPI.ACCESS_TOKEN_PROVIDER)
    ResponseWrapper<VKList<Group>> search(@Param("q") String q);
}
