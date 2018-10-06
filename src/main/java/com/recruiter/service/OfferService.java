package com.recruiter.service;

import com.recruiter.entity.Offer;
import com.recruiter.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation= Propagation.REQUIRED, readOnly=true, noRollbackFor=Exception.class)
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;


    public List<Offer>getOffers() {
        return (List<Offer>)offerRepository.findAll();
    }
}
