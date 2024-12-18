package com.lexadecimals.losersclubfrontend.model;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.lexadecimals.losersclubfrontend.service.AlbumApiService;
import com.lexadecimals.losersclubfrontend.service.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumRepository {

    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Album>> getMutableLiveData() {
        AlbumApiService albumService = RetrofitInstance.getService();
        Call<List<Album>> call = albumService.getAllAlbums();
        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> albums = response.body();
                mutableLiveData.setValue(albums);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.i("GET request", t.getMessage());
            }
        });
        return mutableLiveData;
    }

    public void addAlbum(Album album) {
        AlbumApiService albumService = RetrofitInstance.getService();
        Call<Album> call = albumService.addAlbum(album);
        call.enqueue(new Callback<Album>() {
            @Override
            public void onResponse(Call<Album> call, Response<Album> response) {
                String text = "Successfully added album!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(application.getApplicationContext(), text, duration).show();
            }

            @Override
            public void onFailure(Call<Album> call, Throwable t) {
                String text = "Failed to add album!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(application.getApplicationContext(), text, duration).show();
                Log.e("POST onFailure", t.getMessage());
            }
        });

    }
}
