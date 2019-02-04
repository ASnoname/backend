package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.User;
import ftc.shift.scheduler.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Autowired
    private UserService sut;

    @MockBean
    private UserRepository repository;


    private User user;

    @Before
    public void setUp() {

        //MockitoAnnotations.initMocks(this);

        when(repository.fetchUser()).thenReturn(user);
        sut = new UserService(repository);
    }

    @Test
    public void test() {

        User user1 = sut.provideUser();
        assertEquals(user, user1);
        verify(repository, times(1)).fetchUser();
    }


}
