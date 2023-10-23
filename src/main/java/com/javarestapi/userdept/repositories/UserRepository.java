package com.javarestapi.userdept.repositories;

import com.javarestapi.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{ }
