package com.example.demo.entity;

import javax.persistence.*;

@Table(name = "`test`")
public class Test {
    @Id
    @Column(name = "`u_id`")
    private Integer uId;

    @Column(name = "`u_name`")
    private String uName;

    @Column(name = "`u_age`")
    private Integer uAge;

    /**
     * @return u_id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * @return u_name
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param uName
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * @return u_age
     */
    public Integer getuAge() {
        return uAge;
    }

    /**
     * @param uAge
     */
    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }
}