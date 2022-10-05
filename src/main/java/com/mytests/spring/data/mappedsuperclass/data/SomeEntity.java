package com.mytests.spring.data.mappedsuperclass.data;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * *
 * <p>Created by irina on 31.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@Entity
public class SomeEntity extends MyBaseEntity {
    
    String foo;

    public String getFoo() {
        return foo;
    }
    @Basic
    public void setFoo(String foo) {
        this.foo = foo;
    }
}
