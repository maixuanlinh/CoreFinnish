package com.example.android.miwok;

public class Word {
    private String Eng;
    private String Fin;
    private int mImageResourceId;
    private int mAudioResourceid;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String e, String f) {
        this.Eng = e;
        this.Fin = f;
    }

    public Word(String e, String f, int mImageResourceId, int mAudioResourceid) {
        this.Eng = e;
        this.Fin = f;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceid = mAudioResourceid;

    }

    public  Word(String e, String f, int mAudioResourceid) {
        this.Eng = e;
        this.Fin = f;
        this.mAudioResourceid = mAudioResourceid;
    }

    public String getEng()  {
        return Eng;
    }
    public String getFin() {

        return  Fin;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceid;
    }

    public boolean hasImage() {
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
