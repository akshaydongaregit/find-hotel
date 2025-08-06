package main.service;

import main.dao.Hotel;
import main.rate.HotelRateStrategy;

/**
 * @author akshaydongare
 */
public class CheapestHotelFinderService implements HotelFinderService {

    private final HotelService hotelService;
    private final HotelRateStrategy hotelRateStrategy;

    public CheapestHotelFinderService(HotelService hotelService, HotelRateStrategy hotelRateStrategy) {
        this.hotelService = hotelService;
        this.hotelRateStrategy = hotelRateStrategy;
    }

    public Hotel findHotel() {
        Hotel cheapestHotel = null;
        double cheapestRate = Double.MAX_VALUE;
        for(Hotel hotel: hotelService.getHotels()) {
            double rate = hotelRateStrategy.getHotelRate(hotel);
            if(rate<cheapestRate) {
                cheapestHotel = hotel;
                cheapestRate = rate;
            }
        }
        return cheapestHotel;
    }
}
