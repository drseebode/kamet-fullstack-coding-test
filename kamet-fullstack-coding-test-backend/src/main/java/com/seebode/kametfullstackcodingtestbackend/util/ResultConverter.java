package com.seebode.kametfullstackcodingtestbackend.util;


import com.seebode.kametfullstackcodingtestbackend.model.FieldCount;
import com.seebode.kametfullstackcodingtestbackend.model.FieldResult;
import com.seebode.kametfullstackcodingtestbackend.model.FieldStats;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

public class ResultConverter {

    public static List<FieldResult> convertMaps(List<FieldStats> fieldStatsList, List<FieldCount> fieldcountList, String fieldname) {
        //AggregationResults< DBObject > dbresults = censusDomainRepository.findUniqueResultsWithCountAndAverageAge(column);
        Map<String, FieldResult> results = new HashMap<String,FieldResult>();
        List<FieldResult> result = new ArrayList<FieldResult>();

        for (FieldStats entry: fieldStatsList) {

            int averageAge = entry.getAverageage();
            FieldResult fr = new FieldResult();
            fr.setFieldValue(entry.getFieldvalue());
            fr.setAverageAge(String.valueOf(averageAge));
            results.put(entry.getFieldvalue(),fr );

        }

        for (FieldCount entry: fieldcountList) {
            FieldResult fr = results.get(entry.getFieldvalue());
            if(fr!=null){
                fr.setCount(String.valueOf(entry.getCount()));
            }

        }
        for (FieldResult fresult: results.values()) {
            result.add(fresult);
        }
        result.sort(Comparator.comparing(FieldResult::getAverageAge));
        return result;
    }
}
