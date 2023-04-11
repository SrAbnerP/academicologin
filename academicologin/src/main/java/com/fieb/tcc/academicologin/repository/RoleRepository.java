package com.fieb.tcc.academicologin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fieb.tcc.academicologin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);

}
