package com.example.kakaobirthdaymanagement.network

import retrofit2.http.GET
import retrofit2.http.Header

interface TalkCalendarService {
    @GET("/v2/api/calendar/calendars")
    fun getCalendars(
        @Header("Authorization") authorization: String
    )
}