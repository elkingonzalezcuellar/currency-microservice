package com.fxservice.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="Fxrate")
public class Fxrate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fxratevalue")
    private Integer fxRateValue;
    @Column(name = "fxratedate" )
    private Date fxRateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFxRateValue() {
        return fxRateValue;
    }

    public void setFxRateValue(Integer fxRateValue) {
        this.fxRateValue = fxRateValue;
    }

    public Date getFxRateDate() {
        return fxRateDate;
    }

    public void setFxRateDate(Date fxRateDate) {
        this.fxRateDate = fxRateDate;
    }
}
