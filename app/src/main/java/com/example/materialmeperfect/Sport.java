package com.example.materialmeperfect;

import static android.provider.MediaStore.Audio.AudioColumns.TITLE_KEY;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.DrawableRes;

public class Sport {
    static final String TITLE_KEY = "Title";
    static final String IMAGE_KEY = "Image Resource";
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;
    private final int imageResource;

    /**
     * Constructor for the Sport data model.
     *
     * @param title The name if the sport.
     * @param info  Information about the sport.
     */
    public Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    /**
     * Gets the title of the sport.
     *
     * @return The title of the sport.
     */
    String getTitle() {
        return title;
    }

    /**
     * Gets the info about the sport.
     *
     * @return The info about the sport.
     */
    String getInfo() {
        return info;
    }

    /**
     * Method for creating  the Detail Intent
     * @param context Application context, used for launching the Intent
     * @param title The title of the current Sport
     * @param imageResId The image resource associated with the current sport
     * @return The Intent containing the extras about the sport, launches Detail activity
     */
    static Intent starter(Context context, String title, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, title);
        detailIntent.putExtra(IMAGE_KEY, imageResId);
        return detailIntent;
    }

}
