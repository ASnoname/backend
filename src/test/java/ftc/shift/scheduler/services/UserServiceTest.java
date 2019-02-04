package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.User;
import ftc.shift.scheduler.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Autowired
    private UserService sut;

    private UserRepository repository;

    @Before
    public void setUp() throws Exception {

        repository = mock(UserRepository.class);

        sut = new UserService(repository);
    }

    @Test
    public void provideUserTest() {

        User actual = sut.provideUser();

        User expected = repository.fetchUser();

        assertEquals(expected, actual);

        when(sut.provideUser()).thenReturn(expected);

        verify(repository, times(2)).fetchUser();
    }
}