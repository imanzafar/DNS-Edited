package com.truenorth.dns.com.truenorth.data.entity;


import javax.persistence.*;

@Entity
@Table(name = "DOMAIN")
public class Domain {

    @Id
    @Column(name = "DOMAIN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String domainName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
