import config.AppConfig;
import model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * Created by LeeDaebeom-Mac on 2015. 12. 16..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;


    private User user;

    @Before
    public void setUp(){
        user = new User();
        user.setId("2daebong");
        user.setName("대봉");
        user.setPassword("1234");
    }

    @Test
    public void testSayHello() throws Exception {
        userService.sayHello(user);
    }
}