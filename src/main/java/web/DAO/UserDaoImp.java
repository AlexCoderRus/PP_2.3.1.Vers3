package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImp implements web.DAO.UserDao {
    @PersistenceContext
    private EntityManager em;


    @Override
    @Transactional
    public List<User> getAllUser() {
        return em.createQuery("select user from User user", User.class).getResultList();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    @Transactional
    public void updateUser(User updateUser) {
        em.merge(updateUser);
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

}
