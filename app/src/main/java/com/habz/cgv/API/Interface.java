package com.habz.cgv.API;

import com.habz.cgv.model.ModelResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Interface {
    @GET("movie/now_playing")
    Call<ModelResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<ModelResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}