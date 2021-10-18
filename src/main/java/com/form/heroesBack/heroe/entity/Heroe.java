package com.form.heroesBack.heroe.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Heroe {
@Id
@GeneratedValue
private Long id;
@Column(nullable = false)
private String firstName;
@Column(nullable = false)
private String lastName;
@Column(nullable = false)
private String heroName;
@Column(nullable = false)
private String heroPower;
}