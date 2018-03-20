package com.example.madisondraper.interactivestory.model;

/**
 * Created by madisondraper on 3/19/18.
 */

public class Choice {
    private int textID;
    private int nextPage;

    public Choice(int textID, int nextPage) {
        this.textID = textID;
        this.nextPage = nextPage;
    }

    public int getTextID() {
        return textID;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
