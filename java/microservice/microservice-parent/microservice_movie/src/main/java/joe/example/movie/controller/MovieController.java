package joe.example.movie.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import joe.example.movie.client.UserController;
import joe.example.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RequestMapping("/movie")
@RestController
@Api(value = "电影控制器")
public class MovieController {

//    @Autowired
//    private RestTemplate restTemplate;

//    // 没有使用eureka的版本
//    @RequestMapping(value = "/order", method = RequestMethod.POST)
//    public String order() {
//        // 模拟当前用户
//        Integer id = 6;
//
//        // 使用restTemplate远程调用微服务
//        User user = restTemplate.getForObject("http://localhost:9001/user/"+id, User.class);
//
//        // 查询用户微服务， 获取用户具体信息
//        System.out.println(user+"==正在购票...");
//
//        return "购票成功";
//    }

//    // 使用eureka
    @Autowired
    private DiscoveryClient discoveryClient;
//
//    @RequestMapping(value = "/order", method = RequestMethod.GET)
//    public String order() {
//        // 模拟当前用户
//        Integer id = 6;
//
//        // 需要发现的服务名
//        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-user");
//
//        // 没有使用负载均衡, 只获取第一个服务
//        ServiceInstance serviceInstance = instances.get(0);
//
//        // 使用restTemplate远程调用微服务
//        User user = restTemplate.getForObject("http://"+serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id, User.class);
//
//        // 查询用户微服务， 获取用户具体信息
//        System.out.println(user+"==正在购票...");
//
//        return "购票成功";
//    }

////    // 使用Ribbon负载均衡组件
    @Autowired
    private LoadBalancerClient loadBalancerClient;
//
//    @RequestMapping(value = "/order", method = RequestMethod.GET)
//    public String order() {
//        // 模拟当前用户
//        Integer id = 6;
//
//        // 使用负载均衡，让ribbon帮我们选择一个合适的服务实例（默认：轮询）
//        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-user");
//
//        // 使用restTemplate远程调用微服务
//        User user = restTemplate.getForObject("http://"+serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id, User.class);
//
//        // 查询用户微服务， 获取用户具体信息
//        System.out.println(user+"==正在购票...");
//
//        return "购票成功";
//    }


//    // 使用Ribbon负载均衡组件简化版
//    @RequestMapping(value = "/order", method = RequestMethod.GET)
//    @HystrixCommand(fallbackMethod = "fallback")
//    public String order() {
//        // 模拟当前用户
//        Integer id = 6;
//
//        // 使用restTemplate远程调用微服务
//        User user = restTemplate.getForObject("http://microservice-user/user/" + id, User.class);
//
//        // 查询用户微服务， 获取用户具体信息
//        System.out.println(user+"==正在购票...");
//
//        return "购票成功";
//    }

//    /**
//     * 熔断回滚方法
//     */
//    public String fallback() {
//        return "服务暂时不可用，发生熔断...";
//    }




    // 使用OpenFeign组件简化调用代码

    @Autowired
    private UserController userController;

    @ApiOperation(value = "远程调用用户方法：根据用户ID查询用户")
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String order() {
        // 模拟当前用户
        Integer id = 6;

        User user = userController.findById(id);
        // 查询用户微服务， 获取用户具体信息
        System.out.println(user+"==正在购票...");

        return "购票成功";
    }

}
