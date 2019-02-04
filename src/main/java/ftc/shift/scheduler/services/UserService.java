package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.User;
import ftc.shift.scheduler.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User provideUser() {

        return userRepository.fetchUser();
    }
}