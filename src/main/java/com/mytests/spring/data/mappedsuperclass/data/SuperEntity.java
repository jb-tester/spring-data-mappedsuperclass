package com.mytests.spring.data.mappedsuperclass.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 30.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@MappedSuperclass
public abstract class SuperEntity {

    @Id Integer _id;


     public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        _id = id;
    }
}
