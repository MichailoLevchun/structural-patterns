package main.adapter.image;

import main.adapter.adaptee.ImageAdapter;

public class PictureViewer implements ImageViewer {

    @Override
    public void watchImage(String name, String format) {
        switch (format) {
            case (".jpeg"):
                System.out.println("Watching " + name + ".jpeg");
            break;
            case (".png"):
                System.out.println("Watching " + name + ".png");
                break;
            case (".bmp"):
                System.out.println("Watching " + name + ".bmp");
                break;
            case (".gif"):
                ImageAdapter imageAdapter = new ImageAdapter(format);
                imageAdapter.watchImage(name, format);
                break;
            default:
                System.out.println("Format " + format + " not supported");
        }
    }
}
