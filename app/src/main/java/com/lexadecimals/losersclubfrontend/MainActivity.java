package com.lexadecimals.losersclubfrontend;

import android.app.Application;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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