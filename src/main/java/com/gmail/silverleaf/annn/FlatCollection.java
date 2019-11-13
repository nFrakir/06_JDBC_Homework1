package com.gmail.silverleaf.annn;

import java.util.ArrayList;
import java.util.List;

public class FlatCollection {
    private List<Flat> flats = new ArrayList<>();

    public FlatCollection(List<Flat> flats) {
        super();
        this.flats = flats;
    }

    public FlatCollection() {
        super();
    }

    public void addFlat(Flat flat) {
        flats.add(flat);
    }

    public void addFlat(String district, String address, Double square, int rooms, Double price) {
        flats.add(new Flat(district, address, square, rooms, price));
    }

    public ArrayList<Flat> getFlats() {
        return new ArrayList<>(this.flats);
    }
}
