/*
 * Created by Abhishek Satyanarayanan on 2023.08.30
 * Copyright © 2023 Osman Balci. All rights reserved.
 */

package edu.vt.galleria;

import java.io.Serializable;

public class Photo implements Serializable {

    private String photoFilePath;
    private String thumbnailFilePath;
    private String title;
    private String alt;

    public Photo(String photoPathIn, String thumbnailPathIn, String alt, String title) {
        this.photoFilePath = photoPathIn;
        this.thumbnailFilePath = thumbnailPathIn;
        this.alt = alt;
        this.title = title;
    }

    public String getPhotoFilePath() {
        return photoFilePath;
    }

    public void setPhotoFilePath(String photoFilePath) {
        this.photoFilePath = photoFilePath;
    }

    public String getThumbnailFilePath() {
        return thumbnailFilePath;
    }

    public void setThumbnailFilePath(String thumbnailFilePath) {
        this.thumbnailFilePath = thumbnailFilePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
