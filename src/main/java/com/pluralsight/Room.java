package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds, double roomPrice, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}
