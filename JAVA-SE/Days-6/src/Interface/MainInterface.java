package Interface;

public class MainInterface {
    public static void main(String[] args) {

        IUser iUser = new UserImpl();
        iUser.userAge(20);
        IProfile iProfile = new UserImpl();
        iProfile.userProfileName(20);
    }
}
