package com.google.codelabs.mdc.java.shrine.network;

public class ImageLoader {

    StorageReference refStorage;
    StorageReference pathImagen;

    public ImageLoader(String finalPath)
    {
        refStorage.getReference();
        pathImagen = refStorage.child(finalPath);
    }
}
