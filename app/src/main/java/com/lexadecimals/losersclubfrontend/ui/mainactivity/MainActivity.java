package com.lexadecimals.losersclubfrontend.ui.mainactivity;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lexadecimals.losersclubfrontend.R;
import com.lexadecimals.losersclubfrontend.model.AlbumRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application application = new Application();
        AlbumRepository albumRepository = new AlbumRepository(application);

        albumRepository.getMutableLiveData();

    }
}