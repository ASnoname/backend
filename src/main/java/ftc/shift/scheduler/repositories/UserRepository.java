package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private User user;

    public UserRepository() {

        user = new User("Антон Силуанов");
    }

    public User fetchUser() {

        return user;
    }
}