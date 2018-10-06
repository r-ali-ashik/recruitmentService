package com.recruiter;

import com.recruiter.entity.Application;
import com.recruiter.entity.Offer;
import com.recruiter.repository.OfferRepository;
import com.recruiter.service.OfferService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Slf4j
@SpringBootApplication
public class RecruiterApplication {

    @Autowired
    private OfferService offerService;

	public static void main(String[] args) {
		SpringApplication.run(RecruiterApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo(OfferRepository repository) {
		return (args) -> {
			// save a couple of customers
			Offer offer = new Offer();
			offer.setJobTitle("job title1");
			offer.setNumberOfApplications(10);
			offer.setStartDate(new Date());

            Application application1 = new Application();
            application1.setApplicationStatus("passed");
            application1.setCandidateEmail("test@mail.com");
            application1.setResumeText("test");

            Application application2 = new Application();
            application2.setApplicationStatus("passed");
            application2.setCandidateEmail("test@mail.com");
            application2.setResumeText("tes1212t");

            offer.getApplications().add(application1);
//            offer.getApplications().add(application2);
            application1.setOffer(offer);

			repository.save(offer);

            List<Offer> offers = (List<Offer>) offerService.getOffers();

            System.out.println(":::::::::::::: "+ offers);





		};
	}*/
}
