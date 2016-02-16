package api;

import dto.ResponseWrapper;
import dto.VKList;
import dto.wall.Post;
import ru.shadam.ferry.annotations.ImplicitParam;
import ru.shadam.ferry.annotations.Param;
import ru.shadam.ferry.annotations.Url;

import java.util.List;

/**
 * @author sala
 */
@Url(VKAPI.BASE_URL + "wall")
@ImplicitParam(paramName = "v", constValue = VKAPI.VERSION)
public interface WallOperations {
    @Url(".get")
    ResponseWrapper<VKList<Post>> get(@Param("owner_id") int ownerId);

    @Url(".get")
    ResponseWrapper<VKList<Post>> get(@Param("owner_id") int ownerId,
                                      @Param("offset") int offset,
                                      @Param("count") int count,
                                      @Param("filter") String filter);

    @Url(".get")
    ResponseWrapper<VKList<Post>> get(@Param("domain") String domain);

    @Url(".get")
    ResponseWrapper<VKList<Post>> get(@Param("domain") String domain,
                                      @Param("offset") int offset,
                                      @Param("count") int count,
                                      @Param("filter") String filter);

    // TODO: add extended = 1 support.
    @Url(".search")
    ResponseWrapper<VKList<Post>> search(@Param("owner_id") int ownerId,
                                         @Param("query") String query);

    @Url(".search")
    ResponseWrapper<VKList<Post>> search(@Param("owner_id") int ownerId,
                                         @Param("query") String query,
                                         @Param("owners_only") int ownersOnly,
                                         @Param("count") int count,
                                         @Param("offset") int offset);

    @Url(".search")
    ResponseWrapper<VKList<Post>> search(@Param("domain") String domain,
                                         @Param("query") String query);

    @Url(".search")
    ResponseWrapper<VKList<Post>> search(@Param("domain") String domain,
                                         @Param("query") String query,
                                         @Param("owners_only") int ownersOnly,
                                         @Param("count") int count,
                                         @Param("offset") int offset);

    @Url(".getById")
    ResponseWrapper<List<Post>> getById(@Param("posts") String posts);
}
