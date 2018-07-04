package com.m2i.poe.mesure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MesureRepository implements IMesureRepository {

    private List<Double> theoricalList = new ArrayList<>();
    private List<Double> mesureList = new ArrayList<>();

    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();
        while(line != null) {
            StringTokenizer st = new StringTokenizer(line,";");
            st.nextToken();
            double theorical = Double.parseDouble(st.nextToken());
            double mesure = Double.parseDouble(st.nextToken());
            theoricalList.add(theorical);
            mesureList.add(mesure);
            line = reader.readLine();
        }
        reader.close();
    }

    @Override
    public List<Double> getTheoricalList() {
        return theoricalList;
    }

    @Override
    public List<Double> getMesureList() {
        return mesureList;
    }

    @Override
    public List<Double> getDifferenceList() {
        List<Double> res = new ArrayList<>();
        for(int i = 0;i<mesureList.size();i++) {
            double diff = mesureList.get(i) - theoricalList.get(i);
            res.add(diff);
        }
        return res;
    }

    @Override
    public List<Double> getQuadraticList() {
        List<Double> res = new ArrayList<>();
        for(int i = 0;i<mesureList.size();i++) {
            double diff = mesureList.get(i) - theoricalList.get(i);
            res.add(Math.pow(diff,2));
        }
        return res;
    }

    @Override
    public List<Integer> getTimeDifferenceErrorList(double delta) {
        return(getTimeDifferenceErrorList(delta, getDifferenceList()));
    }

    private List<Integer> getTimeDifferenceErrorList(double delta, List<Double> list) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            if(Math.abs(list.get(i)) >= delta) {
                res.add(i);
            }
        }
        return res;
    }

    @Override
    public List<Integer> getTimeQuatraticErrorList(double delta) {
        return(getTimeDifferenceErrorList(delta, getQuadraticList()));
    }
}
