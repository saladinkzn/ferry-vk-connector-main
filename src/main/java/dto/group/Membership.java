package dto.group;

/**
 * @author sala
 */
public class Membership {
    private int member;
    private int user_id;
    private Integer invitation;

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Integer getInvitation() {
        return invitation;
    }

    public void setInvitation(Integer invitation) {
        this.invitation = invitation;
    }


    @Override
    public String toString() {
        return "Membership{" +
                "member=" + member +
                ", user_id=" + user_id +
                ", invitation=" + invitation +
                '}';
    }
}
