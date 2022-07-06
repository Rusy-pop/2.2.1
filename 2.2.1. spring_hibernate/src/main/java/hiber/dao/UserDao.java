package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void addUserFromDB(User user);
   List<User> getListOfUsers();
}
