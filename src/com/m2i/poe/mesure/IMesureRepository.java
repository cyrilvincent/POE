package com.m2i.poe.mesure;

import java.util.List;

public interface IMesureRepository {

    void load(String uri);
    List<Double> getTheoricalList();
    List<Double> getMesureList();
    List<Double> getDifferenceList();
    List<Double> getQuadraticList();
    List<Integer> getTimeDifferenceErrorList(double delta);
    List<Integer> getTimeQuatraticErrorList(double delta);


}
