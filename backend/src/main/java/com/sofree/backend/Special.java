package com.sofree.backend;

import org.joda.time.LocalDate;

public class Special {
    private String title;
    private String description;
    private String image;
    private LocalDate availableOn;

    public Special() {}

    public Special(String title, String description, String image, LocalDate availableOn) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.availableOn = availableOn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public LocalDate getAvailableOn() {
        return availableOn;
    }
}
