package com.zevnzac.jewishalarmclock;

public class AlarmCardView {
    private int mImageResource;
    private String mTime;
    private String mSecondary;

    public AlarmCardView(int imageResource, String time, String secondary) {
        mImageResource = imageResource;
        mTime = time;
        mSecondary = secondary;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getTime() {
        return mTime;
    }

    public String getSecondary() {
        return mSecondary;
    }
}
