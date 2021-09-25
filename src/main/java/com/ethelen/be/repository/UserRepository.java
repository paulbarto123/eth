package com.ethelen.be.repository;

import com.ethelen.be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, String>, JpaSpecificationExecutor<User>  {

    @Query(value = "SELECT * FROM " +
            "m_users as c " +
            "WHERE " +
            "c.user_name=:username ", nativeQuery = true)
    User findUserLogin(String username);
}
