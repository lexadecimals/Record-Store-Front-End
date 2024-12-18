package com.lexadecimals.losersclubfrontend.ui.mainactivity.addalbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.lexadecimals.losersclubfrontend.model.Album;
import com.lexadecimals.losersclubfrontend.ui.mainactivity.MainActivity;
import com.lexadecimals.losersclubfrontend.ui.mainactivity.MainActivityViewModel;

public class AddAlbumClickHandlers {

    Album album;
    Context context;
    MainActivityViewModel viewModel;

    public AddAlbumClickHandlers(MainActivityViewModel viewModel, Context context, Album album) {
        this.viewModel = viewModel;
        this.context = context;
        this.album = album;
    }

    public void submitAlbumToDb(View view) {
        if (album == null) {
            String warning = "No fields can be empty";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(context.getApplicationContext(), warning, duration).show();
        } else {
            Album newAlbum = new Album(album.getId(), Integer.parseInt(album.getYearOfRelease()),album.getTitle(), album.getArtist(), album.getGenre(), Double.parseDouble(album.getPrice()), Integer.parseInt(album.getItemsInStock()));
        }
        Intent intent = new Intent(context.getApplicationContext(), MainActivity.class);
    }
}
