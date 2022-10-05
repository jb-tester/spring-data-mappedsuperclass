package com.mytests.spring.data.mappedsuperclass.data;

import javax.persistence.Basic;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 30.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@MappedSuperclass
public abstract class MyBaseEntity  extends SuperEntity 
{


    private String _name;
    private AddressEntity _addr;
    

    @Basic
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
    
    @ManyToOne
    @JoinColumn(name = "address_id")
    public AddressEntity getAddr() {
        if (_addr == null)
        {
            _addr = new AddressEntity();
        }
        return _addr;
    }

    public void setAddr(AddressEntity _address) {
        _addr = _address;
    }
}
