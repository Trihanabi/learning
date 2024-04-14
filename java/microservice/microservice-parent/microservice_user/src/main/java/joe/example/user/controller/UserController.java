package joe.example.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import joe.example.user.entity.User;
import joe.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@Api(value = "用户控制器")
public class UserController {
    @Autowired
    private UserService userService;

//    @ApiOperation(value = "查询所有用户")
    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        // 模拟用户数据
//        List<User> list = new ArrayList<User>();
//        list.add(new User(1, "张三", "123456", "男", 1000.0 ));
//        list.add(new User(2, "李四", "123456", "女", 1500.0 ));
//        list.add(new User(3, "王五", "123456", "男", 5000.0 ));
        return userService.findAll();
    }

    @ApiOperation(value = "主键查询")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Integer id) {
//        System.out.println("用户微服务1111");
        System.out.println("用户微服务2222");
        return userService.findById(id);
    }

    @ApiOperation(value = "添加用户")
    @RequestMapping(method = RequestMethod.POST)
    public String add(@RequestBody User user) {
        userService.add(user);
        return "添加成功";
    }

    @ApiOperation(value = "更新用户")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String update(@RequestBody User user, @PathVariable Integer id) {
        user.setId(id);
        userService.update(user);
        return "修改成功";
    }

    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteId(@PathVariable Integer id) {
        userService.deleteById(id);
        return "删除成功";
    }
}
