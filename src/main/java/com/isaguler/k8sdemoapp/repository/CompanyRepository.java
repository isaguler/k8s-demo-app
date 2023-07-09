package com.isaguler.k8sdemoapp.repository;

import com.isaguler.k8sdemoapp.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
