package main.adapter;

import main.adapter.image.PictureViewer;

public class Launch {

    public static void main(String[] args) {
        PictureViewer pictureViewer = new PictureViewer();
        pictureViewer.watchImage("pngformat", ".png");
        pictureViewer.watchImage("jpegformat", ".jpeg");
        pictureViewer.watchImage("bmpformat", ".bmp");
        pictureViewer.watchImage("gifformat", ".gif");
        pictureViewer.watchImage("jpgformat", ".jpg");
    }
}
