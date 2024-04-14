package joe.example.movie.client;


import joe.example.movie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户微服务远程接口
 * 1. @FeignClient
 * 2. @RequestMapping 完整路径
 * 3. @PathVariable(value = "id")
 * 3.
 */
@FeignClient(value = "microservice-user", fallback = UserControllerImpl.class)
@Primary
public interface UserController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable(value = "id") Integer id);
}
