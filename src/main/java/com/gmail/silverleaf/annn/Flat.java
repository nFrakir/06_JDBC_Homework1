package com.gmail.silverleaf.annn;

public class Flat {
    private String district;
    private String address;
    private Double square;
    private int rooms;
    private Double price;

    public Flat(String district, String address, Double square, int rooms, Double price) {
        super();
        this.district = district;
        this.address = address;
        this.square = square;
        this.rooms = rooms;
        this.price = price;
    }

    public Flat() {
        super();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
