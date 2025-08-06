package main;

import main.dao.Hotel;
import main.rate.HotelFixedRateStrategy;
import main.rate.HotelRateStrategy;
import main.service.CheapestHotelFinderService;
import main.service.HotelFinderService;
import main.service.HotelService;

import java.util.Comparator;
import java.util.List;

public class ReservationSystem {
    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel() {
        HotelService hotelService = new HotelService(this.hotels);
        HotelRateStrategy hotelRateStrategy = new HotelFixedRateStrategy();
        HotelFinderService cheapestHotelFinderService = new CheapestHotelFinderService(hotelService, hotelRateStrategy);
        return cheapestHotelFinderService.findHotel();
    }
}
