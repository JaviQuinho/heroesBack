package com.form.heroesBack.mission;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mission {
    
@Id
@GeneratedValue
private long id;
@Column(nullable=false)
private String instructions;
}
