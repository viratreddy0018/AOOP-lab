import com.example.config.AppConfig;
import com.example.controller.UserController;
import com.example.model.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserControllerTest {
    private UserController userController;

    @Before
    public void setUp() {
        AppConfig config = new AppConfig();
        userController = config.createUserController(); // Manually create the controller with dependencies
    }

    @Test
    public void testRegister() {
        User user = new User("john", "password123");
        assertTrue(userController.register(user));
    }

    @Test
    public void testLogin() {
        User user = new User("john", "password123");
        userController.register(user);
        assertTrue(userController.login("john", "password123"));
    }
}