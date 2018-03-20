package com.example.madisondraper.interactivestory.model;

/**
 * Created by madisondraper on 3/19/18.
 */

public class Page {
    private int imageID;
    private int textID;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinalPage = false;

    public Page(int imageID, int textID) {
        this.imageID = imageID;
        this.textID = textID;
        this.isFinalPage = true;
    }

    public Page(int imageID, int textID, Choice choice1, Choice choice2) {
        this.imageID = imageID;
        this.textID = textID;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getTextID() {
        return textID;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }
}
