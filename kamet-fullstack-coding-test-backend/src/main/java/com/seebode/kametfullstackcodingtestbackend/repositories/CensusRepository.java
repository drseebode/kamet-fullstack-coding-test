package com.seebode.kametfullstackcodingtestbackend.repositories;

import com.seebode.kametfullstackcodingtestbackend.model.CensusData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CensusRepository extends PagingAndSortingRepository<CensusData, String> {

    @Override
    CensusData findOne(String id);

    @Override
    void delete(CensusData deleted);



}
