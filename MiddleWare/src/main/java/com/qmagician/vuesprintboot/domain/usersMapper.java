package com.qmagician.vuesprintboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersMapper extends JpaRepository<users, String> {
}
