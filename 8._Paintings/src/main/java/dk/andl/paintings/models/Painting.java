package dk.andl.paintings.models;


public class Painting {

    private String artist;
    private double price;
    private String title;
    private String genre;
    private int year;

    public Painting(String artist) {
        this.artist = artist;
    }

    public Painting(String artist, double price, String title, String genre, int year) {
        this.artist = artist;
        this.price = price;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
