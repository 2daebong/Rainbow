package service;

import model.User;
import org.springframework.stereotype.Component;

/**
 * Created by LeeDaebeom-Mac on 2015. 12. 16..
 */
@Component
public class UserService {

    public void sayHello(User user){
        System.out.println("hello " + user.getName());
    }
}
