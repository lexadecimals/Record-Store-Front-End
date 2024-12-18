package com.lexadecimals.losersclubfrontend.ui.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lexadecimals.losersclubfrontend.R;
import com.lexadecimals.losersclubfrontend.databinding.AlbumItemBinding;
import com.lexadecimals.losersclubfrontend.model.Album;

import java.util.List;

public class AlbumAdaptor extends RecyclerView.Adapter<AlbumAdaptor.AlbumViewHolder> {


   private List<Album> albums;

   public static class AlbumViewHolder extends RecyclerView.ViewHolder {
       private final AlbumItemBinding albumItemBinding;
       public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
           super(albumItemBinding.getRoot());
           this.albumItemBinding = albumItemBinding;
       }
   }

   public  AlbumAdaptor(List<Album> albums, Context context) {
       this.albums = albums;
   }

   @NonNull
   @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       AlbumItemBinding albumItemBinding = DataBindingUtil.inflate(
               LayoutInflater.from(parent.getContext()),
               R.layout.album_item,
               parent, false
       );
       return new AlbumViewHolder(albumItemBinding);
   }

   @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
       Album album = albums.get(position);
       holder.albumItemBinding.setAlbum(album);
   }

   @Override
    public int getItemCount() {
       return albums.size();
   }
}
