package Interface;

public class UserImpl implements IUser, IProfile {
    @Override
    public String userName(int uid) {
        System.out.println("userName: " + uid);
        return null;
    }

    @Override
    public int userAge(int uid) {
        System.out.println("userAge: " + uid);
        return 0;
    }

    @Override
    public String userProfileName(int uid) {
        System.out.println("userProfilName: " + uid);
        return null;
    }
}
