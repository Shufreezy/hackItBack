package com.allhail.hobbyhub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.allhail.hobbyhub.models.Hobby;

@RepositoryRestResource
public interface HobbyRepository extends JpaRepository<Hobby, Long> {

}
