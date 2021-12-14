package pl.adam.hotelsapplication.remote.rest.dto.response;

import pl.adam.hotelsapplication.domain.model.ReservationStatusType;
import pl.adam.hotelsapplication.remote.rest.dto.common.AddHotelDto;
import pl.adam.hotelsapplication.remote.rest.dto.common.PersonDto;

import java.util.List;

public class ReservationStatusDto {
    private Integer id;
    private ReservationStatusType status;
    private List<AddHotelDto> hotels;
    private PersonDto person;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(Integer id, ReservationStatusType status, List<AddHotelDto> hotels, PersonDto person) {
        this.id = id;
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
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
