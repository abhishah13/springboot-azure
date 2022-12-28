package com.spring.azure.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.azure.entity.User;

public interface UserRepository extends CrudRepository<User , Integer> {

}
