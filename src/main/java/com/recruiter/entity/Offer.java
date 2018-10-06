package com.recruiter.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Table(name = "offer")
public class Offer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator" )
    @Column(name = "offer_id")
    private String offerId;

    @Column(name = "job_title", unique = true)
    private String jobTitle;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "number_of_application")
    private Integer numberOfApplications;

    @OneToMany(mappedBy = "offer", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Application> applications = new ArrayList<>();
}
