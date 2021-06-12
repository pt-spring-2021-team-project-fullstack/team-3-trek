package com.jackrtrekr.jackrtrekrteam3.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @ManyToOne
    private Continent continent;
    @OneToMany(mappedBy = "region")
    public Collection<Trek> treks;

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Continent getContinent() {
        return continent;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Region() {

    }

    public Region(String location, Continent continent, Trek... treks) {
        this.location = location;
        this.continent = continent;
        this.treks = new ArrayList<>((Arrays.asList(treks)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
