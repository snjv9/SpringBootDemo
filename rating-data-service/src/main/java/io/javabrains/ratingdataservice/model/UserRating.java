package io.javabrains.ratingdataservice.model;

import java.util.List;

public class UserRating {
    List<Rating> UserRating;

    public List<Rating> getUserRating() {
        return UserRating;
    }

    public void setUserRating(List<Rating> userRating) {
        UserRating = userRating;
    }
}
