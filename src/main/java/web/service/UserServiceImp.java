package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDao udi;

    @Autowired
    public UserServiceImp(UserDao udi) {
        this.udi = udi;
    }

    @Override
    @Transactional
    public List<User> getAllUser() {
        return udi.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        udi.saveUser(user);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        udi.removeUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User updateUser) {
        udi.updateUser(updateUser);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return udi.getUserById(id);
    }
}

