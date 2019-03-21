/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package siia.booking.domain.hotel;

import siia.booking.domain.FinancialAmount;

import java.util.Date;

/**
 * @author Jonas Partner
 */
public class HotelBooking {

    private final Hotel hotel;

    private final Date checkInDate;

    private final Date checkOutDate;

    private final FinancialAmount financialAmount;

    private boolean paid = false;

    private String bookingConfirmation;

    public HotelBooking(Hotel hotel, Date checkInDate, Date checkOutDate,
                        FinancialAmount financialAmount,  String bookingConfirmation) {
        this.hotel = hotel;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.financialAmount = financialAmount;
        this.bookingConfirmation = bookingConfirmation;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public FinancialAmount getFinancialAmount() {
        return financialAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getBookingConfirmation() {
        return bookingConfirmation;
    }

    public void setBookingConfirmation(String bookingConfirmation) {
        this.bookingConfirmation = bookingConfirmation;
    }
}
