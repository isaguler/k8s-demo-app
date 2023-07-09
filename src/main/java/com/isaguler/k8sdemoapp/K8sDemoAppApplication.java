package com.isaguler.k8sdemoapp;

import com.isaguler.k8sdemoapp.model.Company;
import com.isaguler.k8sdemoapp.repository.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableMongoRepositories
public class K8sDemoAppApplication implements CommandLineRunner {

	public K8sDemoAppApplication(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(K8sDemoAppApplication.class, args);
	}

	private final CompanyRepository companyRepository;

	@Override
	public void run(String... args) throws Exception {
		Company company1 = new Company(UUID.randomUUID().toString(), "microsoft", new Point(33.54, 44.57), new HashSet<>(List.of("tech", "science")), 1975, "microsoft.com");
		Company company2 = new Company(UUID.randomUUID().toString(), "c-2", new Point(33.54, 44.57), new HashSet<>(List.of("food", "market")), 1980, "c1.com");
		Company company3 = new Company(UUID.randomUUID().toString(), "c-3", new Point(33.54, 44.57), new HashSet<>(List.of("art", "music")), 1990, "c2.com");

		companyRepository.saveAll(List.of(company1, company2, company3));
	}
}
