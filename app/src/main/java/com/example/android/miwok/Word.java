package com.example.android.miwok;

import android.widget.ImageView;

/**
 * Created by Irhamfauzan on 16/11/2016.
 */

public class Word {
    private String englishTranslate;
    private String miwokTranslate;
    private int imageResource= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;


    public Word(String englishTranslates, String miwokTranslates, int image, int AudioResourceId) {
        englishTranslate=englishTranslates;
        miwokTranslate=miwokTranslates;
        imageResource=image;
        mAudioResourceId= AudioResourceId;
    }

    public Word(String englishTranslates, String miwokTranslates, int AudioResourceId) {
        englishTranslate=englishTranslates;
        miwokTranslate=miwokTranslates;
        mAudioResourceId = AudioResourceId;
    }
    public String getEnglishTranslate(){
        return englishTranslate;
    }

    public String getMiwokTranslate(){
        return miwokTranslate;
    }

    public int getImageView(){
        return imageResource;
    }

    public boolean hasImage(){
        return imageResource != NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

}
