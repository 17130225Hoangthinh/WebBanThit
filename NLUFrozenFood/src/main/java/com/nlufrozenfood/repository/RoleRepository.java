package com.nlufrozenfood.repository;

import org.springframework.data.repository.CrudRepository;

import com.nlufrozenfood.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
