import api.VKAPI;
import api.impl.VKAPIImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.group.Group;
import dto.ResponseWrapper;
import dto.User;
import dto.group.Membership;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import ru.shadam.ferry.factory.ClientImplementationFactory;
import ru.shadam.ferry.simple.DefaultClientImplementationFactory;

import java.util.List;

/**
 * @author sala
 */
public class Program {
    public static void main(String[] args) {
        final CloseableHttpClient build = HttpClientBuilder.create().build();
        final ClientImplementationFactory clientImplementationFactory = new DefaultClientImplementationFactory(build, new ObjectMapper());
        final VKAPI vkapi = new VKAPIImpl("access_token", HttpClientBuilder.create().build(), new ObjectMapper());
        final ResponseWrapper<List<User>> users = vkapi.getUserOperations().get("tshakurov");
        for(User user: users.getResponse()) {
            System.out.println(user);
        }

        final ResponseWrapper<List<Membership>> resp = vkapi.getGroupOperations().groupsIsMemberByList("1", "1,2");
        System.out.println(resp);

        final ResponseWrapper<List<Group>> tamrecords_dnb = vkapi.getGroupOperations().groupsGetById("tamrecords_dnb");
        System.out.println(tamrecords_dnb);
    }
}
