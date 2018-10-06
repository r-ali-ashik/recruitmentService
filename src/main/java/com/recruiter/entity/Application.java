package com.recruiter.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(
        name="application",
        uniqueConstraints=@UniqueConstraint(columnNames={"applicant_emil", "offer_id"})
)
//@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator( name = "UUID", strategy = "org.hibernate.id.UUIDGenerator" )
    @Column(name = "application_id")
    private String applicationId;
    @Column(name = "applicant_emil")
    private String candidateEmail;
    @Column(name = "resume_text")
    private String resumeText;
    @Column(name = "application_status")
    private String applicationStatus;
  /*  @Column(name = "offer_id")
    private String offer_id;*/

    @ManyToOne(optional = false)
    @JoinColumn(name = "offer_id")
    private Offer offer;

}
