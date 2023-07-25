package com.example.database_study.repository;

import com.example.database_study.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}


