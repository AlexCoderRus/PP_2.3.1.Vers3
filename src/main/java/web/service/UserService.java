package web.service;

import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User updateUser);
    User getUserById(Long id);
}
