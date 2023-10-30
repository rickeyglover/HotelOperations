package com.pluralsight;

public class Reservation {
    private String roomType;
    private double reservationPrice;
    private int numberOfNights;
    private boolean weekend;
    private int reservationTotal;

    public Reservation(String roomType, double reservationPrice, int numberOfNights, boolean weekend, int reservationTotal){
        this.roomType = roomType;
        this.reservationPrice = reservationPrice;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getReservationPrice() {
        return reservationPrice;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getReservationTotal() {
        return reservationTotal;
    }
}