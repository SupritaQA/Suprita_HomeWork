package com.training.java.hierarchy.onlineshop;

import java.util.Objects;

public class Sample {

    private String field1  ;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }



    @Override
    public String toString() {
        return "Sample{" +
                "field1='" + field1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample = (Sample) o;
        return Objects.equals(field1, sample.field1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1);
    }
}
