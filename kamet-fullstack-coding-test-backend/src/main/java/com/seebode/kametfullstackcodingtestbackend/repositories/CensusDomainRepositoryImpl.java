package com.seebode.kametfullstackcodingtestbackend.repositories;

import com.seebode.kametfullstackcodingtestbackend.model.CensusData;
import com.seebode.kametfullstackcodingtestbackend.model.FieldCount;
import com.seebode.kametfullstackcodingtestbackend.model.FieldResult;
import com.seebode.kametfullstackcodingtestbackend.model.FieldStats;
import com.seebode.kametfullstackcodingtestbackend.util.ResultConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.DESC;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

public class CensusDomainRepositoryImpl implements CensusDomainRepositoryExtension {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<FieldResult> findUniqueResultsWithCountAndAverageAge(String fieldname){


        TypedAggregation<CensusData> agg3 = newAggregation(CensusData.class,
                group(fieldname).avg("age").as("averageage"),
                project("averageage").and("fieldvalue").previousOperation(),
                limit(100),
                sort(DESC, "averageage")
        );

        AggregationResults<FieldStats> result1 = mongoTemplate.aggregate(agg3, FieldStats.class);
        List<FieldStats> fieldStatsList = result1.getMappedResults();


        Aggregation agg = Aggregation.newAggregation(
                project(fieldname).and("age"),
                group(fieldname).count().as("count"),
                project("count").and("fieldvalue").previousOperation(),
                limit(100),
                sort(DESC, "count")
        );

        AggregationResults<FieldCount> results = mongoTemplate.aggregate(agg, "census", FieldCount.class);
        List<FieldCount> fieldcountList = results.getMappedResults();



        return ResultConverter.convertMaps(fieldStatsList,fieldcountList,fieldname);




        /*ProjectionOperation projectStage = project(fieldname, "age");

        GroupOperation averageAgeInGroup = Aggregation.group(fieldname)
                .avg("age").as("average_age").count().as("count");
        SortOperation sortByAvgAgeDesc = sort(new Sort(DESC, "average_age"));

        Aggregation aggregation = Aggregation.newAggregation(averageAgeInGroup,sortByAvgAgeDesc);
        AggregationResults<Document> result = mongoTemplate.aggregate(aggregation, "census_small", Document.class);
        List<Document> resultList = result.getMappedResults();
        List<Map<String, String>> resultMaps = ResultConverter.convertMaps(resultList);

        return resultList;
        */


    }

}
