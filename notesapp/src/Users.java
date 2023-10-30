import java.util.ArrayList;
import java.util.List;

public class Users {
  private List<User> usersCollections;

  public Users() {
    this.usersCollections = new ArrayList<>() {
      {
        add(new User(101, "ficrihnp"));
        add(new User(102, "jupri"));
        add(new User(103, "sirati"));
        add(new User(104, "rojulman"));
      }
    };
  }

  public void add(User user) {
    this.usersCollections.add(user);
  }

  public void remove(User user) {
    User existUser = this.find(user.getId());
    this.usersCollections.remove(existUser);
  }

  public User find(int id) throws UserNotExistExceptions {
    List<User> existUser = this.usersCollections.stream()
        .filter(thisUser -> thisUser.getId() == (id))
        .toList();
    boolean isUserNotExist = existUser.isEmpty();
    if (isUserNotExist) {
      throw new UserNotExistExceptions();
    }
    return existUser.get(0);
  }

  @Override
  public String toString() {
    return "Users [usersCollections=" + this.usersCollections + "]";
  }
}
