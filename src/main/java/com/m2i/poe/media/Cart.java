package com.m2i.poe.media;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartRow> cartRowList = new ArrayList<>();

    public List<CartRow> getMediaList() {
        return cartRowList;
    }

    public double getTotalNetPrice() {
//        double res = 0;
//        for(CartRow row : cartRowList) {
//            res += row.getMedia().getNetPrice();
//        }
//        return res;
        return cartRowList.stream().mapToDouble(row -> row.getMedia().getNetPrice()).sum();
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
//        CartRow res = null;
//        for(CartRow row : cartRowList) {
//            if(m == row.getMedia()) {
//                res = row;
//                break;
//            }
//        }
//        return res;
        return cartRowList.stream().filter(row -> row.getMedia() == m).findFirst().orElse(null);
    }

    public void remove(IMedia m) throws MediaException {
        CartRow row = isMediaInCart(m);
        if(row == null) {
            throw new MediaException("Cart error");
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

    public void validate() throws MediaException {
        if(getTotalNetPrice() <= 0) {
            throw new MediaException("Cart error");
        }
        else {
            // TODO
        }
    }

    private boolean isValid = false;

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
}
