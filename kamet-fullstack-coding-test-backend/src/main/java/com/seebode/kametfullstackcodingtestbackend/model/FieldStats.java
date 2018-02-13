package com.seebode.kametfullstackcodingtestbackend.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class FieldStats {

    String fieldvalue;
    @Field("averageage") int averageage;

    public String getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(String fieldvalue) {
        this.fieldvalue = fieldvalue;
    }

    public int getAverageage() {
        return averageage;
    }

    public void setAverageage(int averageage) {
        this.averageage = averageage;
    }
}
