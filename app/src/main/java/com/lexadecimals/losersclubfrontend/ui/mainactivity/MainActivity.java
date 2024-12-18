package com.lexadecimals.losersclubfrontend.ui.mainactivity;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lexadecimals.losersclubfrontend.R;
import com.lexadecimals.losersclubfrontend.databinding.ActivityMainBinding;
import com.lexadecimals.losersclubfrontend.model.Album;
import com.lexadecimals.losersclubfrontend.model.AlbumRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Album> albums;
    private AlbumAdaptor albumAdaptor;
    private MainActivityViewModel mainActivityViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainActivityViewModel = new ViewModelProvider(this)
                .get(MainActivityViewModel.class);
        getAllAlbums();
    }
    private void getAllAlbums() {
        mainActivityViewModel.getAllAlbums().observe(this, new Observer<List<Album>>() {
            @Override
            public void onChanged(List<Album> albumsFromLiveData) {
                albums = albumsFromLiveData;
                displayInRecyclerView();
            }
        });
    }

    public void displayInRecyclerView() {
        recyclerView = activityMainBinding.recyclerview;
        albumAdaptor = new AlbumAdaptor(albums, this);
        recyclerView.setAdapter(albumAdaptor);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        albumAdaptor.notifyDataSetChanged();
    }
}