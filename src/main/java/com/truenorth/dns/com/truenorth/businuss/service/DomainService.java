package com.truenorth.dns.com.truenorth.businuss.service;

import com.truenorth.dns.com.truenorth.data.entity.Domain;
import com.truenorth.dns.com.truenorth.truenorth.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainService {
    private DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public boolean getDomain(String domainName){

        Iterable<Domain> domains = this.domainRepository.findAll();
        

        return false;
    }





}
