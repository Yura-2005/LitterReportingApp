package com.example.litterreportingapp.firebase;

public class PollutedArea {
    private double latitude;
    private double longitude;
    private String photoUrl;
    private String comment;

    public PollutedArea(double latitude, double longitude, String photoUrl, String comment) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.photoUrl = photoUrl;
        this.comment = comment;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getComment() {
        return comment;
    }
}

