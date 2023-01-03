package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.DAO.UserDaoImp;
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
    public List<User> getAllUser() {
        return udi.getAllUser();
    }

    @Override
    public void saveUser(User user) {
        udi.saveUser(user);
    }

    @Override
    public void removeUserById(long id) {
        udi.removeUserById(id);
    }

    @Override
    public void updateUser(User updateUser) {
        udi.updateUser(updateUser);
    }

    @Override
    public User getUserById(Long id) {
        return udi.getUserById(id);
    }
}

