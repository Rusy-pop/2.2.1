package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUserFromDB(User user);
    List<User> getListOfUsers();
}
