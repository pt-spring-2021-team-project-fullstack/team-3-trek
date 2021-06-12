package com.jackrtrekr.jackrtrekrteam3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    private String difficulty;
    @OneToMany(mappedBy = "type")
    private Collection<Trek> treks;

    public Long getId() {
        return id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Type() {

    }

    public Type(String difficulty, Trek... treks) {
        this.difficulty = difficulty;
        this.treks = new ArrayList<>(Arrays.asList(treks));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(id, type.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
