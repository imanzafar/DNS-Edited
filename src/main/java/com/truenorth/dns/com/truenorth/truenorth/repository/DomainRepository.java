package com.truenorth.dns.com.truenorth.truenorth.repository;


import com.truenorth.dns.com.truenorth.data.entity.Domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends CrudRepository<Domain, Long> {

    Domain findByDomainName(String domainName);
}
