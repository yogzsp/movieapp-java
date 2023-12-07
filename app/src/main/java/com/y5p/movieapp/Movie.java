package com.y5p.movieapp;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id") // Tambahan: ID film dari server
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("overview")
    private String description;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("genres")
    private String genres;

    @SerializedName("poster_path")
    private String posterPath;

    // Constructor with parameters
    public Movie(int id, String title, String description, String releaseDate, String genres, String posterPath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.genres = genres;
        this.posterPath = posterPath;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Other getters and methods...

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getGenres() {
        return genres;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getImageUrl() {
        return "https://image.tmdb.org/t/p/w185/" + posterPath;
    }
}
