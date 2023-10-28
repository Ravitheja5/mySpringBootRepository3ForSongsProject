package com.example.movie;

class Movie {
    private int movieId;
    private String movieName;
    private String leadActor;

    public Movie(int movieId, String movieName, String leadActor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public int getId() {
        return movieId;
    }

    public void setId(int newId) {
        this.movieId = newId;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setName(String newName) {
        this.movieName = newName;
    }

    public String getLeadActor() {
        return this.leadActor;
    }

    public void setLeadActor(String newLeadActor) {
        this.leadActor = newLeadActor;

    }

}

// ccbp submit JSBCPQQ555
