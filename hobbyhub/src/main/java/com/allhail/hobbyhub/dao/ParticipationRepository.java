package com.allhail.hobbyhub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.allhail.hobbyhub.models.Participation;

@RepositoryRestResource
public interface ParticipationRepository extends JpaRepository<Participation, Long> {

}
