package com.mytests.spring.data.mappedsuperclass.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * *
 * <p>Created by irina on 30.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@Entity
public class Shop extends MyBaseEntity{

    String kind;

    @Basic @Column(name = "shop_kind")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
