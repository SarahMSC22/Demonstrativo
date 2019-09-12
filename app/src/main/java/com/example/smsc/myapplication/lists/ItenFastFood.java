package com.example.smsc.myapplication.lists;

import java.io.Serializable;

public class ItenFastFood implements Serializable {

    private String mText;

    public ItenFastFood(String text) {
        this.mText = text;
}

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
