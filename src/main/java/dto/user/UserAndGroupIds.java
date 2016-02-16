package dto.user;

import dto.VKList;

/**
 * @author sala
 */
public class UserAndGroupIds {
    private VKList<Integer> users;
    private VKList<Integer> groups;

    public VKList<Integer> getUsers() {
        return users;
    }

    public void setUsers(VKList<Integer> users) {
        this.users = users;
    }

    public VKList<Integer> getGroups() {
        return groups;
    }

    public void setGroups(VKList<Integer> groups) {
        this.groups = groups;
    }
}
