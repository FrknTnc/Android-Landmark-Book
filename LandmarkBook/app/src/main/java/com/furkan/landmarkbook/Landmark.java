package com.furkan.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name;
    String country;
    int image;
    String detail;

    public Landmark(String name, String country, int image, String detail) {
        this.name = name;
        this.country = country;
        this.image = image;
        this.detail = detail;
    }
}
