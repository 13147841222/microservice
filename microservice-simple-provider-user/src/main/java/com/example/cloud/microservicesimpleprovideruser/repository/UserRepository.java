package com.example.cloud.microservicesimpleprovideruser.repository;

import com.example.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhumingli
 * @create 2018-10-08 下午10:02
 * @desc
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
