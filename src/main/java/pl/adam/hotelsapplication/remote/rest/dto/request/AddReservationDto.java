package pl.adam.hotelsapplication.remote.rest.dto.request;

import pl.adam.hotelsapplication.remote.rest.dto.common.AddHotelDto;
import pl.adam.hotelsapplication.remote.rest.dto.common.PersonDto;

import java.util.List;

public class AddReservationDto {
    private List<AddHotelDto> hotels;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<AddHotelDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<AddHotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<AddHotelDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
