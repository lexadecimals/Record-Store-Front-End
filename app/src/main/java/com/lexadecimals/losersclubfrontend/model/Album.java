package com.lexadecimals.losersclubfrontend.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.lexadecimals.losersclubfrontend.BR;

public class Album  extends BaseObservable {
    private Long id;
    private int yearOfRelease;
    private String title;
    private String artist;
    private String genre;
    private double price;
    private int itemsInStock;

    public Album() {
    }

    public Album(Long id, int yearOfRelease, String title, String artist, String genre, double price, int itemsInStock) {
        this.id = id;
        this.yearOfRelease = yearOfRelease;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.itemsInStock = itemsInStock;
    }
    @Bindable
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);

    }
    @Bindable
    public String getYearOfRelease() {
        return String.valueOf(yearOfRelease);
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = Integer.parseInt(yearOfRelease);
        notifyPropertyChanged(BR.yearOfRelease);
    }
    @Bindable
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);

    }
    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);

    }
    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }

    @Bindable
    public String  getPrice() {
        return String.valueOf(price);
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
        notifyPropertyChanged(BR.price);

    }
    @Bindable
    public String getItemsInStock() {
        return String.valueOf(itemsInStock);
    }

    public void setItemsInStock(String itemsInStock) {
        this.itemsInStock = Integer.parseInt(itemsInStock);
        notifyPropertyChanged(BR.itemsInStock);

    }
}
