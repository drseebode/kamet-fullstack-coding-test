package com.seebode.kametfullstackcodingtestbackend.repositories;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CensusDomainRepository  extends MongoRepository<Document,Long>, CensusDomainRepositoryExtension {
}
