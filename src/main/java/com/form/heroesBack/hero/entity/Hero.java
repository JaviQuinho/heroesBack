package com.form.heroesBack.hero.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.form.heroesBack.mission.entity.Mission;

import lombok.Data;

@Data
@Entity
public class Hero {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String heroName;

    @NotNull
    private String heroPower;

    @ManyToMany(mappedBy = "heroes")
    private List<Mission> missions;
}
