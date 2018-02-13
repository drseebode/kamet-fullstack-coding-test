package com.seebode.kametfullstackcodingtestbackend.repositories;

import com.seebode.kametfullstackcodingtestbackend.model.FieldResult;

import java.util.List;

public interface CensusDomainRepositoryExtension {

    public List<FieldResult> findUniqueResultsWithCountAndAverageAge(String fieldname);
}
