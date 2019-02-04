package ftc.shift.scheduler.controller;

import ftc.shift.scheduler.models.User;
import ftc.shift.scheduler.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController sut;

    private BaseResponse<User> expected;

    @Before
    public void setUp() {

        //when(userService.provideUser()).thenReturn(expected);
        sut = new UserController(userService);
    }

    @Test
    public void provideUser() {

        User actual = sut.provideUser().getData();

        assertEquals(expected.getData(), actual);

        verify(userService, times(1)).provideUser();
    }
}