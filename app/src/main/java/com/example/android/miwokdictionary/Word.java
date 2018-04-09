package com.example.android.miwokdictionary;

/**
 * Created by aggsh on 1/3/2018.
 */

public class Word {
    private String mMiwokTranslation = null;
    private String mDefaultTranslation = null;
    private int src=NO_IMAGE_PROVIDED;
    private int audioSrc;

    private static final int NO_IMAGE_PROVIDED = -1;

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getSrc() {
        return src;
    }

    public Word(String mwok, String translation,int src,int audioSrc) {
        this.mMiwokTranslation = mwok;
        this.mDefaultTranslation = translation;
        this.src =  src;
        this.audioSrc=audioSrc;
    }

    public int getAudioSrc() {
        return audioSrc;
    }

    public Word(String mwok, String translation, int audioSrc) {
        this.mMiwokTranslation = mwok;
        this.mDefaultTranslation = translation;
        this.audioSrc=audioSrc;
    }

    public boolean hasImage(){
        return src!=NO_IMAGE_PROVIDED;
    }
}
