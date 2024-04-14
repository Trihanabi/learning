package joe.example.user.dao;

import joe.example.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 提供增删改查
// JpaRepository<自定义类， id数据类型>
public interface UserDao extends JpaRepository<User, Integer> {
}
