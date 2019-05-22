package main.adapter.adaptee;

import main.adapter.image.ImageViewer;
import main.adapter.animation.AnimatedImageViewer;
import main.adapter.animation.GifViewer;

public class ImageAdapter implements ImageViewer {
    private AnimatedImageViewer animatedImageViewer;

    public ImageAdapter (String format) {
        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer = new GifViewer();
        }
    }

    @Override
    public void watchImage(String name, String format) {
        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer.watchGif(name);
        }
    }
}
