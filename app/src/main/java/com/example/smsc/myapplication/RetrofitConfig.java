package com.example.smsc.myapplication;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://ws.matheuscastiglioni.com.br/ws/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    public CEPService getCEPService(){
        return this.retrofit.create(CEPService.class);
    }

}
