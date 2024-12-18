package com.lexadecimals.losersclubfrontend.model;

public class Album  {
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYearOfRelease() {
        return String.valueOf(yearOfRelease);
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = Integer.parseInt(yearOfRelease);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String  getPrice() {
        return String.valueOf(price);
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }

    public String getItemsInStock() {
        return String.valueOf(itemsInStock);
    }

    public void setItemsInStock(String itemsInStock) {
        this.itemsInStock = Integer.parseInt(itemsInStock);
    }
}
