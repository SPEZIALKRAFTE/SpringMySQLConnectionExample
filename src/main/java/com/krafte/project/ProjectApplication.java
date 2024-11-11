package com.krafte.project;

import com.krafte.project.Entity.StoreInformation;
import com.krafte.project.Repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StoreInformation storeInformationOne = new StoreInformation("Amazon", "Online shop", "+7 775 107 38 02");
		StoreInformation storeInformationTwo = new StoreInformation("Kaspi.kz", "Online bank shop", "+7 775 107 38 02");
		StoreInformation storeInformationThree = new StoreInformation("Phoenix", "Online shop", "+7 775 107 38 02");

		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.save(storeInformationTwo);
		storeInformationRepository.save(storeInformationThree);

		storeInformationRepository.findByStoreName("Amazon").forEach(
				val -> System.out.println(val)
		);
	}
}
