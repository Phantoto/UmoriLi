package com.example.umorili;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsontestAPI {
    // Образец
    // http://date.jsontest.com/
    @GET("/")
    public Call<ServerTime> getServerDateTime();
}