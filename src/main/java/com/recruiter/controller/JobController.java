package com.recruiter.controller;

import com.recruiter.entity.Offer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class JobController {

    @GetMapping(value = "jobs")
    public ResponseEntity<Offer> getJobs() {
        return null;
    }
}
