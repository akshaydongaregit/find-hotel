package main.service;

import main.dao.Hotel;

import java.util.List;

/**
 * @author akshaydongare
 */
public class HotelService {

    private List<Hotel> hotels;

    public HotelService(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
