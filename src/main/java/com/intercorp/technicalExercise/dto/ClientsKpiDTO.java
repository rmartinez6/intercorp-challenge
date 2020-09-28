package com.intercorp.technicalExercise.dto;


public class ClientsKpiDTO {

    private Double averageAge;
    private Double standardDeviation;

    public ClientsKpiDTO(Double averageAge, Double standardDeviation) {
        this.averageAge = averageAge;
        this.standardDeviation = standardDeviation;
    }

    public Double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(Double averageAge) {
        this.averageAge = averageAge;
    }

    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
}
