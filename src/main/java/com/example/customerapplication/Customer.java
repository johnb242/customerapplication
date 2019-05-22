package com.example.customerapplication;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Native;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    @Column(name = "customerid")
    private long id;
    //@NotNull
    //  @Size(min=3)
    @Column(name = "title")
    private String title;
    // @NotNull
    //  @Size(min=3)
    @Column(name = "firstname")
    private String firstname;
    // @NotNull
    //  @Size(min=3)
    @Column(name = "lastname")
    private String lastname;
    // @NotNull
    // @Size(min=3)
    @Column(name = "streetaddress")
    private String streetaddress;
    // @NotNull
    //  @Size(min=3)
    @Column(name = "emailaddress")
    private String emailaddress;
    //@NotNull
    // @Size(min=3)
    @Column(name = "position")
    private String position;
    // @NotNull
    // @Size(min=3)
    @Column(name = "companyid")
    private String companyid;
    // @NotNull
    // @Size(min=3)
    @Column(name = "cityid")
    private String cityid;
    //@NotNull
    //@Size(min=3)
    @Column(name = "stateid")
    private String stateid;
    // @NotNull
    // @Size(min=3
    @Column(name = "zipcodeid")
    private String zipcodeid;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getStateid() {
        return stateid;
    }

    public void setStateid(String stateid) {
        this.stateid = stateid;
    }

    public String getZipcodeid() {
        return zipcodeid;
    }

    public void setZipcodeid(String zipcodeid) {
        this.zipcodeid = zipcodeid;
    }
}

