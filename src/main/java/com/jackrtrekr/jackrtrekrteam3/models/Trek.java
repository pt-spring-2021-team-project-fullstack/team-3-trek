package com.jackrtrekr.jackrtrekrteam3.models;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Region region;
    @ManyToOne
    private Type type;
    private String packList;
    private String length;
    private String reviews;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPackList() {
        return packList;
    }

    public String getLength() {
        return length;
    }

    public String getReviews() {
        return reviews;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region getRegion() {
        return region;
    }

    public Type getType() {
        return type;
    }

    public Trek() {

    }

    public Trek(String name, String description, Continent continent, Region region, Type type, String packList, String length, String reviews) {
        this.name = name;
        this.description = description;
        this.continent = continent;
        this.region = region;
        this.type = type;
        this.packList = packList;
        this.length = length;
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
