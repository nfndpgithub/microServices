package com.nemanja.user.repository;

import com.nemanja.user.entity.UserS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserS,Long> {
    UserS findByUserId(Long userId);
}
