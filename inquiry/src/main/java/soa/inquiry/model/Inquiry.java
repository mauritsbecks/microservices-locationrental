package soa.inquiry.model;


import java.util.Date;
import java.util.List;

public class Inquiry {
    // receive from user: date, capacity,
    // return locations that are free and have the capacity

    Date date;

    int guests;

    List<Location> locations;
}
