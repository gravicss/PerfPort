/*
 * Created by Abhishek Satyanarayanan on 2023.08.30
 * Copyright © 2023 Osman Balci. All rights reserved.
 */

package edu.vt.galleria;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "photoService")
@ApplicationScoped
public class PhotoService {

    private List<Photo> listOfPhotos;

    @PostConstruct
    public void init() {
        listOfPhotos = new ArrayList<>();

        listOfPhotos.add(new Photo("/resources/images/photos/photo1.jpg",
                "/resources/images/photos/photo1s.jpg",
                "Siberian Husky",
                "Siberian Husky"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo2.jpg",
                "/resources/images/photos/photo2s.jpg",
                "Border Collie",
                "Border Collie"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo3.jpg",
                "/resources/images/photos/photo3s.jpg",
                "Dalmation",
                "Dalmation"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo4.jpg",
                "/resources/images/photos/photo4s.jpg",
                "Golden Retriever",
                "Golden Retriever"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo5.jpg",
                "/resources/images/photos/photo5s.jpg",
                "Shetland Sheepdog",
                "Shetland Sheepdog"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo6.jpg",
                "/resources/images/photos/photo6s.jpg",
                "Pomeranian",
                "Pomeranian"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo7.jpg",
                "/resources/images/photos/photo7s.jpg",
                "German Shepherd",
                "German Shepherd"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo8.jpg",
                "/resources/images/photos/photo8s.jpg",
                "Bulldog",
                "Bulldog"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo9.jpg",
                "/resources/images/photos/photo9s.jpg",
                "Beagle",
                "Beagle"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo10.jpg",
                "/resources/images/photos/photo10s.jpg",
                "Boxer",
                "Boxer"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo11.jpg",
                "/resources/images/photos/photo11s.jpg",
                "Chihuahua",
                "Chihuahua"));

        listOfPhotos.add(new Photo("/resources/images/photos/photo12.jpg",
                "/resources/images/photos/photo12s.jpg",
                "Pug",
                "Pug"));

    }

    public List<Photo> getListOfPhotos() {
        return listOfPhotos;
    }
}
