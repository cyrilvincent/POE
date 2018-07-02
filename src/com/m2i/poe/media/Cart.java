package com.m2i.poe.media;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<IMedia> mediaList = new ArrayList<>();

    public List<IMedia> getMediaList() {
        return mediaList;
    }

    public double getTotalNetPrice() {
        double res = 0;
        for(IMedia m : mediaList) {
            res += m.getNetPrice();
        }
        return res;
    }

    public void add(IMedia m) {
        mediaList.add(m);
    }

    public void remove(IMedia m) {
        mediaList.remove(m);
    }
}
