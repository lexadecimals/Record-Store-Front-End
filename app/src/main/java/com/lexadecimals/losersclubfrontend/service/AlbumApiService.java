package com.lexadecimals.losersclubfrontend.service;

import com.lexadecimals.losersclubfrontend.model.Album;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumApiService {
    @GET("albums")
    Call<Album> getAllAlbums();
}
