package com.udemy.ecommerce.dao;

import com.udemy.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Long> {

    List<State> findByCountryCode(@Param("code") String code);
}
