package com.mytests.spring.data.mappedsuperclass.data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * *
 * <p>Created by irina on 30.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@Entity @Table(name = "address")
public class AddressEntity extends SuperEntity {

    
    private String _city;
    private String street;
    private int building;
    private int flat;
    

    public String getCity() {
        return _city;
    }

    public void setCity(String _city) {
        this._city = _city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
