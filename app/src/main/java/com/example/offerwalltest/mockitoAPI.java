package com.example.offerwalltest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface mockitoAPI {
    @GET("/api/v1/trending")
    Call<List<PostModelA>> getData();

    @GET("/api/v1/object/{id}")
    Call<PostModelB> getObject(@Path("id") String id);
}
