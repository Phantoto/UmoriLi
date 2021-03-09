package com.example.umorili;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface UmoriliService {

    // Образец
    // http://www.umori.li/api/get?name=bash&num=5

    @GET("api/get")
    Call<List<UPost>> getData(@Query("name") String resourceName, @Query("num") int count);

    Retrofit retrofit = new Retrofit.Builder()
            //.baseUrl("http://www.umori.li/")
            .baseUrl("http://umorili.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}