package com.matancita.easyroutebackend.domain;

import com.matancita.easyroutebackend.specialfunctions.ERole;

import jakarta.persistence.*;

/**
 * This class represents a Role entity that is mapped to the "roles" table in the database.
 * It contains an id field that is the primary key of the table, a name field that represents the role name,
 * and getters and setters for both fields.
 */
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role() {

    }

    public Role(ERole name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
    
}
