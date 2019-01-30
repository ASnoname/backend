package ftc.shift.scheduler.controller;

import ftc.shift.scheduler.models.User;
import ftc.shift.scheduler.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String USER_PATH = Resources.USER_PREFIX;

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    @CrossOrigin
    @GetMapping(USER_PATH)
    public @ResponseBody
    BaseResponse<User> provideUser() {

        return new BaseResponse<>(userService.provideUser());
    }
}