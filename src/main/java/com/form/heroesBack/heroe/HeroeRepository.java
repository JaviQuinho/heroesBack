package com.form.heroesBack.heroe;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Heroe.class)
public interface HeroeRepository extends CrudRepository<Heroe, Long> {
    public List<Heroe> findByFirstNameStartingWithIgnoreCase(@Param("firstName") String firstName);
}