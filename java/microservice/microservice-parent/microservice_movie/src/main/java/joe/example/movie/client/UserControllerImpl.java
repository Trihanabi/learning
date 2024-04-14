package joe.example.movie.client;

import joe.example.movie.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController{

    @Override
    public User findById(Integer id) {
        System.out.println("服务暂时不可用");
        return null;
    }
}
