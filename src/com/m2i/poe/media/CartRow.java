package com.m2i.poe.media;

public class CartRow {

    private IMedia media;
    private int quantity = 1;

    public CartRow() {}

    public CartRow(IMedia m) {
        media = m;
    }

    public void increment() {
        quantity++;
    }

    public void decrement() {
        if(quantity > 1) {
            quantity--;
        }
        else {
            System.out.println("Quantity error");
        }
    }

    public IMedia getMedia() {
        return media;
    }

    public void setMedia(IMedia media) {
        this.media = media;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "CartRow: "+quantity+", "+media;
    }
}
