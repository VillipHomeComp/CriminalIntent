package com.example.comp.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
// Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}