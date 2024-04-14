package joe.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}