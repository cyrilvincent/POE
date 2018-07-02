package com.m2i.poe.media;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartRow> cartRowList = new ArrayList<>();

    public List<CartRow> getMediaList() {
        return cartRowList;
    }

    public double getTotalNetPrice() {
        double res = 0;
        for(CartRow row : cartRowList) {
            res += row.getMedia().getNetPrice();
        }
        return res;
    }

    public void add(IMedia m) {
        CartRow row = isMediaInCart(m);
        if(row == null) {
            row = new CartRow(m);
            cartRowList.add(row);
        }
        else {
            row.increment();
        }
    }

    private CartRow isMediaInCart(IMedia m) {
        CartRow res = null;
        for(CartRow row : cartRowList) {
            if(m == row.getMedia()) {
                res = row;
            }
        }
        return res;
    }

    public void remove(IMedia m) {
        CartRow row = isMediaInCart(m);
        if(row == null) {
            System.out.println("Cart error");
        }
        else {
            if(row.getQuantity() > 1) {
                row.decrement();
            }
            else {
                cartRowList.remove(row);
            }
        }
    }
}
