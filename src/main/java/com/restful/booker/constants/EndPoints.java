package com.restful.booker.constants;

public class EndPoints {
    /**
     * This is Endpoints of booking api
     */
    public static final String GET_ALL_BOOKING_LIST = "/list booking";
    public static final String GET_SINGLE_BOOKING_BY_ID = "/{bookingID}";
    public static final String UPDATE_BOOKING_BY_ID = "/{bookingID}";
    public static final String DELETE_BOOKING_BY_ID = "/{bookingID}";

    /**
     * This is Endpoints of Authentication api
     */
    public static final String LOGIN = "/api";
    public static final String LOG_OUT = "/close_session";
}