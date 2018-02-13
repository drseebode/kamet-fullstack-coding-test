package com.seebode.kametfullstackcodingtestbackend.controller;

import com.seebode.kametfullstackcodingtestbackend.model.CensusData;
import com.seebode.kametfullstackcodingtestbackend.model.FieldResult;
import com.seebode.kametfullstackcodingtestbackend.repositories.CensusDomainRepository;
import com.seebode.kametfullstackcodingtestbackend.repositories.CensusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CensusController {

    @Autowired
    CensusRepository censusRepository;

    @Autowired
    CensusDomainRepository censusDomainRepository;


    @RequestMapping(method= RequestMethod.GET, value="/censusdata")
    public Iterable<CensusData> product() {
        return censusRepository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/censusdata")
    public String save(@RequestBody CensusData product) {
        censusRepository.save(product);

        return product.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/censusdata/{id}")
    public CensusData show(@PathVariable String id) {
        return censusRepository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.GET, value="/censusdata/bycolumn/{column}")
    public List<FieldResult> getByColumn(@PathVariable String column) {

        return censusDomainRepository.findUniqueResultsWithCountAndAverageAge(column);

    }





}
